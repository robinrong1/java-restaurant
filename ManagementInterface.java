import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.SwingWorker;

public class ManagementInterface{
	private DefaultListModel<String> modelServe;
	private Queue<String> contain;
	private JList<String> orderList;
	private JList<String> serveList;
	private JScrollPane scrollPaneServe;
	private JScrollPane scrollPaneOrder;
	public ManagementInterface( JPanel cardPanel, CardLayout cl, DefaultListModel<String> modelOrder,  List<Order> productList, StorageRoom storage) {

		modelServe = new DefaultListModel<>();
		contain = new LinkedList<String>();
		orderList = new JList<>(modelOrder);
		serveList = new JList<>(modelServe);
		scrollPaneServe = new JScrollPane(serveList);
		scrollPaneOrder = new JScrollPane(orderList);
		Waiter waiter = new Waiter();
		Chef chef = new Chef();

		JPanel empPanel = new JPanel();
		empPanel.setLayout(new BorderLayout());
		JPanel vertPanel = new JPanel();

		vertPanel.setLayout(new BoxLayout(vertPanel, BoxLayout.PAGE_AXIS));

		JButton btnCook = new JButton("Cook");

		JButton btnServe = new JButton("Serve");
		btnServe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(modelServe.getSize() != 0) {
					//serve the food on top of the list as long as there is food on the list
					waiter.serve(modelServe.get(0), contain.peek());
					modelServe.remove(0);
					contain.poll();
				}
				else {
					//if there are not food on the list at all, inform the user that no items need to be served
					JOptionPane.showMessageDialog(null, "There is no items to be served at the moment", "Waiter", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

		JButton back = new JButton("Main Menu");
		back.addActionListener(new ActionListener() {//go to management interface
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(cardPanel, "1");
			}
		});

		vertPanel.add(btnCook);
		vertPanel.add(btnServe);
		vertPanel.add(back);

		empPanel.add(vertPanel, BorderLayout.CENTER);



		JPanel cookPanel = new JPanel();
		cookPanel.setLayout(new BoxLayout(cookPanel, BoxLayout.PAGE_AXIS));
		JPanel servePanel = new JPanel();
		servePanel.setLayout(new BoxLayout(servePanel, BoxLayout.PAGE_AXIS));
		JLabel orderque = new JLabel("Orders to be cooked");
		JLabel serveque = new JLabel("Orders to be served");
		cookPanel.add(orderque);
		//empPanel.add(serveque, BorderLayout.CENTER);
		servePanel.add(serveque);
		cookPanel.add(scrollPaneOrder);
		//empPanel.add(scrollPaneServe, BorderLayout.CENTER);
		servePanel.add(scrollPaneServe);
		//add the JList

		empPanel.add(cookPanel, BorderLayout.WEST);
		empPanel.add(servePanel, BorderLayout.EAST);JProgressBar bar = new JProgressBar();
		bar.setValue(0);
		btnCook.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				boolean needStock = false;
				String itemName = "null";
				if(modelOrder.getSize() != 0) {
					for(int i = 0; i<productList.get(0).getOrderIngre().size(); i++) {
						if(storage.ingredients.get(productList.get(0).getOrderIngre().get(i)) <= 0) {
							needStock = true;
							itemName = productList.get(0).getOrderIngre().get(i);
							break;
						}
					}
					if(needStock!= true) {
						for(int j = 0; j<productList.get(0).getOrderIngre().size(); j++) {

							storage.ingredients.put(productList.get(0).getOrderIngre().get(j)/*key*/, storage.ingredients.get(productList.get(0).getOrderIngre().get(j))-1/*value*/);

						}

					
					modelServe.addElement(modelOrder.get(0));
					modelOrder.remove(0);
					chef.cookStart(productList.get(0).getName());
					btnCook.setEnabled(false);
					btnServe.setEnabled(false);
					ProgressWorker pw = new ProgressWorker(productList.get(0).getCookTime(), productList);
					pw.addPropertyChangeListener(new PropertyChangeListener() {
						//use a swing worker to run the cooking loop in the background so that the interface doesn't freeze until cooking is finished
						@Override
						public void propertyChange(PropertyChangeEvent evt) {
							String name = evt.getPropertyName();
							if (name.equals("progress")) {
								int progress = (int) evt.getNewValue();
								bar.setValue(progress);
								bar.repaint();
							} else if (name.equals("state")) {
								SwingWorker.StateValue state = (SwingWorker.StateValue) evt.getNewValue();
								switch (state) {
								//when the progress bar is finished, enable the cook button again
								case DONE:
									btnCook.setEnabled(true);
									btnServe.setEnabled(true);
									break;
								}
							}
						}
					});
					pw.execute();
					productList.get(0).displayIngredients();
					contain.offer(productList.get(0).getContainer());
					//display the ingredients used for each product



					productList.remove(0);

					}
					else {
						JOptionPane.showMessageDialog(null, "Your " + itemName + " has run out of stock, go to the stock room and restock your inventory", "Stocker", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				else {
					//if there are not food on the list at all, inform the user that no items need to be served
					JOptionPane.showMessageDialog(null, "There is no items to be cooked at the moment", "Waiter", JOptionPane.INFORMATION_MESSAGE);
				}	
				//remove the item after its been cooked

				/*
				fill(bar, productList.get(0).getCookTime());
				productList.remove(0);
				 */
			}
		});

		vertPanel.add(bar);

		cardPanel.add(empPanel, "3");
	}
	public class ProgressWorker extends SwingWorker<Object, Object> {

		int time;
		String cooked;
		Chef chef = new Chef();

		public ProgressWorker(int time,  List<Order> productList){
			this.time = time;
			this.cooked = productList.get(0).getName();
		}
		@Override
		protected Object doInBackground() throws Exception {
			//loop to add progress to the bar
			for (int i = 0; i <= 100; i++) {        
				setProgress(i);
				try {
					Thread.sleep(time);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			chef.cookFinish(cooked);
			//once the loop is over, the item is fully cooked, call the cookFinish method to inform the user that

			setProgress(0);
			//reset progress bar after the item is cooked
			return null;
		}
	}

}