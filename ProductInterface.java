import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ProductInterface{
	private String [] fries = {"poutine", "normal fries"};
	private String [] drinks = {"coke", "hot coffee", "iced coffee"};
	private String [] patty = {"Beef", "Chicken", "Pork", "Fish"};
	private String [] vegetables = {"Lettuce", "Red Cabbage", "Onions"};
	private String [] size = {"Large", "Medium", "Small"};
	private String [] num = {"1", "2", "3","4", "5", "6","7", "8", "9", "10"};
	public ProductInterface(JPanel cardPanel, CardLayout cl, DefaultListModel<String> modelOrder, List<Order> productlist) {
		Cashier cash = new Cashier();
		JPanel mainPanel = new JPanel();

		
		//product page
		JPanel borderPanel = new JPanel();
		borderPanel.setLayout(new BorderLayout());

		JPanel proPanel = new JPanel();//panel for product interface

		JLabel lblBurgers = new JLabel("Burgers");

		JPanel burPanel = new JPanel();//panel for burgers
		burPanel.setLayout(new BoxLayout(burPanel, BoxLayout.PAGE_AXIS));
		burPanel.add(lblBurgers);

		JPanel pattyPanel = new JPanel();//panel for patty
		pattyPanel.setLayout(new BoxLayout(pattyPanel, BoxLayout.LINE_AXIS));

		JLabel lblPatty = new JLabel("Patty");

		JComboBox comboBoxPat = new JComboBox(patty);

		pattyPanel.add(lblPatty);
		pattyPanel.add(comboBoxPat);

		burPanel.add(pattyPanel);

		JLabel lblPickles = new JLabel("Pickles");
		JCheckBox checkBoxPickles = new JCheckBox("Yes/No");
		JPanel picklePanel = new JPanel();//panel for patty
		picklePanel.setLayout(new BoxLayout(picklePanel, BoxLayout.LINE_AXIS));
		picklePanel.add(lblPickles);
		picklePanel.add(checkBoxPickles);

		burPanel.add(picklePanel);
		JLabel lblCheese = new JLabel("Cheese");
		JCheckBox checkBoxCheese = new JCheckBox("Yes/No");

		JPanel cheesePanel = new JPanel();//panel for patty
		cheesePanel.setLayout(new BoxLayout(cheesePanel, BoxLayout.LINE_AXIS));
		cheesePanel.add(lblCheese);
		cheesePanel.add(checkBoxCheese);
		burPanel.add(cheesePanel);

		JLabel lblVegetable = new JLabel("Vegetable");

		JComboBox comboBoxVege = new JComboBox(vegetables);

		JPanel vegePanel = new JPanel();//panel for patty
		vegePanel.setLayout(new BoxLayout(vegePanel, BoxLayout.LINE_AXIS));
		vegePanel.add(lblVegetable);
		vegePanel.add(comboBoxVege);
		burPanel.add(vegePanel);

		JPanel fryPanel = new JPanel();//panel for burgers
		fryPanel.setLayout(new BoxLayout(fryPanel, BoxLayout.PAGE_AXIS));
		JLabel lblFries = new JLabel("Fries");
		fryPanel.add(lblFries);

		JLabel lblFriesType = new JLabel("Type");
		JComboBox comboBoxFries = new JComboBox(fries);

		JPanel fryTypePanel = new JPanel();//panel for patty
		fryTypePanel.setLayout(new BoxLayout(fryTypePanel, BoxLayout.LINE_AXIS));
		fryTypePanel.add(lblFriesType);
		fryTypePanel.add(comboBoxFries);

		fryPanel.add(fryTypePanel);
		JLabel lblFrySize = new JLabel("Size");

		JComboBox comboBoxFrySize = new JComboBox(size);

		JPanel frySizePanel = new JPanel();//panel for patty
		frySizePanel.setLayout(new BoxLayout(frySizePanel, BoxLayout.LINE_AXIS));
		frySizePanel.add(lblFrySize);
		frySizePanel.add(comboBoxFrySize);

		fryPanel.add(frySizePanel);

		JPanel drinkPanel = new JPanel();//panel for burgers
		drinkPanel.setLayout(new BoxLayout(drinkPanel, BoxLayout.PAGE_AXIS));
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setBounds(424, 11, 46, 14);
		drinkPanel.add(lblDrink);

		JLabel lblDrinkType = new JLabel("Type");
		JComboBox comboBoxDrinks = new JComboBox(drinks);

		JPanel drinkTypePanel = new JPanel();//panel for patty
		drinkTypePanel.setLayout(new BoxLayout(drinkTypePanel, BoxLayout.LINE_AXIS));
		drinkTypePanel.add(lblDrinkType);
		drinkTypePanel.add(comboBoxDrinks);

		drinkPanel.add(drinkTypePanel);

		JLabel lblDrinkSize = new JLabel("Size");

		JComboBox comboBoxDrinkSize = new JComboBox(size);

		JPanel drinkSizePanel = new JPanel();//panel for patty
		drinkSizePanel.setLayout(new BoxLayout(drinkSizePanel, BoxLayout.LINE_AXIS));
		drinkSizePanel.add(lblDrinkSize);
		drinkSizePanel.add(comboBoxDrinkSize);

		drinkPanel.add(drinkSizePanel);

		JPanel snackPanel = new JPanel();
		snackPanel.setLayout(new BoxLayout(snackPanel, BoxLayout.PAGE_AXIS));

		JLabel lblSnack = new JLabel("Snacks");

		JPanel coneBoxPanel = new JPanel();
		coneBoxPanel.setLayout(new FlowLayout());
		JCheckBox checkBoxCone = new JCheckBox("Vanilla Cone");
		JComboBox comboBoxCone = new JComboBox(num);

		coneBoxPanel.add(checkBoxCone);
		coneBoxPanel.add(comboBoxCone);
		JPanel hashBoxPanel = new JPanel();
		hashBoxPanel.setLayout(new FlowLayout());
		JCheckBox checkBoxHashBrowns = new JCheckBox("Hash Browns");
		JComboBox comboBoxHash = new JComboBox(num);

		hashBoxPanel.add(checkBoxHashBrowns);
		hashBoxPanel.add(comboBoxHash);
		JPanel pieBoxPanel = new JPanel();
		pieBoxPanel.setLayout(new FlowLayout());
		JCheckBox checkBoxPie = new JCheckBox("Apple Pie");
		JComboBox comboBoxPie = new JComboBox(num);


		pieBoxPanel.add(checkBoxPie);
		pieBoxPanel.add(comboBoxPie);
		JPanel nuggBoxPanel = new JPanel();
		nuggBoxPanel.setLayout(new FlowLayout());
		JCheckBox checkBoxNuggets = new JCheckBox("Chicken Nuggets");
		JComboBox comboBoxNugg = new JComboBox(num);


		nuggBoxPanel.add(checkBoxNuggets);
		nuggBoxPanel.add(comboBoxNugg);

		snackPanel.add(lblSnack);
		snackPanel.add(coneBoxPanel);
		snackPanel.add(hashBoxPanel);
		snackPanel.add(pieBoxPanel);
		snackPanel.add(nuggBoxPanel);

		proPanel.add(burPanel);
		proPanel.add(fryPanel);
		proPanel.add(drinkPanel);
		proPanel.add(snackPanel);

		JButton back = new JButton("Main Menu");
		back.addActionListener(new ActionListener() {//go to management interface
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(cardPanel, "1");
			}
		});

		

		JPanel proButtons = new JPanel();
		JLabel revenue = new JLabel("Total revenue: ");
		proButtons.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
		proButtons.setLayout(new BoxLayout(proButtons, BoxLayout.LINE_AXIS));
		proButtons.add(back);
		//add the buttons to button panel

		borderPanel.add(proPanel, BorderLayout.CENTER);
		borderPanel.add(proButtons, BorderLayout.SOUTH);//add button panel to mainpanel
		mainPanel.add(borderPanel);

		JButton btnOrder = new JButton("Order");
		proButtons.add(btnOrder);
		proButtons.add(revenue);

		JButton calCost = new JButton("Calculate total order cost");
		proButtons.add(calCost);

		calCost.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				cash.calCost(6.99);//add burger price
				
				if(comboBoxFries.getSelectedItem() == "poutine") {


					if(comboBoxFrySize.getSelectedItem() == "Large") {

						cash.calCost(4.59);
					}
					else if(comboBoxFrySize.getSelectedItem() == "Medium") {

						cash.calCost(3.99);
					}
					else if(comboBoxFrySize.getSelectedItem() == "Small") {

						cash.calCost(3.19);
					}

				}

				else if(comboBoxFries.getSelectedItem() == "frenchFries") {//calculate the fries' cost depending on its size


					if(comboBoxFrySize.getSelectedItem() == "Large") {

						cash.calCost(3.19);
					}
					else if(comboBoxFrySize.getSelectedItem() == "Medium") {

						cash.calCost(2.49);
					}
					else if(comboBoxFrySize.getSelectedItem() == "Small") {

						cash.calCost(1.69);
					}

				}



				if(comboBoxDrinkSize.getSelectedItem() == "Large") {//calculate the drink cost depending on its size

					cash.calCost(2.69);
				}
				else if(comboBoxDrinkSize.getSelectedItem() == "Medium") {

					cash.calCost(1.89);
				}
				else if(comboBoxDrinkSize.getSelectedItem() == "Small") {

					cash.calCost(1.19);
				}

				if(checkBoxCone.isSelected() == true) {
					cash.calCost(1.79* Integer.valueOf((String)comboBoxCone.getSelectedItem()));
				}

				if(checkBoxHashBrowns.isSelected() == true) {
					cash.calCost(1.79* Integer.valueOf((String)comboBoxHash.getSelectedItem()));
				}

				if(checkBoxPie.isSelected() == true) {
					cash.calCost(1.19* Integer.valueOf((String)comboBoxPie.getSelectedItem()));
				}

				if(checkBoxNuggets.isSelected() == true) {
					cash.calCost(5.99* Integer.valueOf((String)comboBoxNugg.getSelectedItem()));
				}
				JOptionPane.showMessageDialog(null, "Your order's total cost is: " + Math.round(cash.getOrderCost()*100.0)/100.0, "Cashier", JOptionPane.INFORMATION_MESSAGE);
				cash.setOrderCost(0);
			}
		});
		
		btnOrder.addActionListener(new ActionListener() {//when order button is clicked in product interface, process the orders by adding elements to productList as well as modelOrder
			public void actionPerformed(ActionEvent e) {

				productlist.add(new Burgers((String) comboBoxPat.getSelectedItem(), checkBoxPickles.isSelected(), checkBoxCheese.isSelected(), (String) comboBoxVege.getSelectedItem() ));
				modelOrder.addElement("burger");
				cash.acceptPayment(productlist.get(productlist.size()-1).getPrice());//get the price of the item that was just ordered
				
				if(comboBoxFries.getSelectedItem() == "poutine") {
					modelOrder.addElement("poutine");
					productlist.add(new Poutine((String) comboBoxFrySize.getSelectedItem()) );
					cash.acceptPayment(productlist.get(productlist.size()-1).getPrice());
					//orderQueue.offer(new Poutine((String) comboBoxFrySize.getSelectedItem()) );

					/*	for(Object s : orderQueue) { 
						  System.out.println(s.toString()); 
						} */

					//	System.out.println(orderQueue.peek().toString());
					
				}

				else if(comboBoxFries.getSelectedItem() == "normal fries") {
					modelOrder.addElement("normal fries");
					productlist.add(new Fries((String) comboBoxFrySize.getSelectedItem()) );
					cash.acceptPayment(productlist.get(productlist.size()-1).getPrice());
				}

				if(comboBoxDrinks.getSelectedItem() == "hot coffee") {
					modelOrder.addElement("Coffee");
					productlist.add(new Coffee((String) comboBoxDrinkSize.getSelectedItem(), false));
					cash.acceptPayment(productlist.get(productlist.size()-1).getPrice());
				}
				else if(comboBoxDrinks.getSelectedItem() == "coke"){
					modelOrder.addElement("Coke");
					productlist.add(new Coke((String) comboBoxDrinkSize.getSelectedItem()));
					cash.acceptPayment(productlist.get(productlist.size()-1).getPrice());
				}
				else if(comboBoxDrinks.getSelectedItem() == "iced coffee") {
					modelOrder.addElement("Coffee");
					productlist.add(new Coffee((String) comboBoxDrinkSize.getSelectedItem(), true));
					cash.acceptPayment(productlist.get(productlist.size()-1).getPrice());
				}
				if(checkBoxCone.isSelected() == true) {
					modelOrder.addElement("Vanilla Cone");
					productlist.add(new VanillaCone(Integer.valueOf((String)comboBoxCone.getSelectedItem())));
					cash.acceptPayment(productlist.get(productlist.size()-1).getPrice() * Integer.valueOf((String)comboBoxCone.getSelectedItem()));
					
				}

				if(checkBoxHashBrowns.isSelected() == true) {
					modelOrder.addElement("HashBrowns");
					productlist.add(new HashBrowns(Integer.valueOf((String)comboBoxCone.getSelectedItem())));
					cash.acceptPayment(productlist.get(productlist.size()-1).getPrice()* Integer.valueOf((String)comboBoxCone.getSelectedItem()));
				}

				if(checkBoxPie.isSelected() == true) {
					modelOrder.addElement("Apple Pie");
					productlist.add(new ApplePie(Integer.valueOf((String)comboBoxCone.getSelectedItem())));
					cash.acceptPayment(productlist.get(productlist.size()-1).getPrice()* Integer.valueOf((String)comboBoxCone.getSelectedItem()));
				}

				if(checkBoxNuggets.isSelected() == true) {
					modelOrder.addElement("chicken nuggets");
					productlist.add(new ChickenNuggets(Integer.valueOf((String)comboBoxCone.getSelectedItem())));
					cash.acceptPayment(productlist.get(productlist.size()-1).getPrice()* Integer.valueOf((String)comboBoxCone.getSelectedItem()));
				}

				revenue.setText("Total Reveune: " + Math.round(cash.getTotalRev()*100.0)/100.0);
				//System.out.println(cash.getTotalRev());
				cash.orderPlaced();
			}
		});
		cardPanel.add(mainPanel, "2");
	}

}