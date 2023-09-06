import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.SwingWorker;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.awt.*;    

public class Interface extends Order{
	private JFrame frame;

	private DefaultListModel<String> modelOrder = new DefaultListModel<>();
	//list of orders to be cooked
	public static void main(String[] args) {//main
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//launch the application
				try {
					Interface window = new Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Interface() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CardLayout cl = new CardLayout();
		JPanel cardPanel = new JPanel();
		cardPanel.setLayout(cl);
		new MainMenu(cardPanel,cl);
		StorageRoom storage = new StorageRoom(cardPanel, cl);
		new ProductInterface(cardPanel, cl, modelOrder, productList);
		new ManagementInterface(cardPanel, cl, modelOrder, productList, storage);
		new EmployeeInterface(cardPanel, cl);


		frame.getContentPane().add(cardPanel);
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);


	}



}
