import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenu {
	
	public MainMenu(JPanel cardPanel, CardLayout cl) {

		JPanel menuPanel = new JPanel();
		menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.PAGE_AXIS));
		
		JLabel text = new JLabel("Main Menu");
		text.setFont(new Font("Serif", Font.BOLD, 20));
		JButton cashRegister = new JButton("Cash register");
		JButton kitchen = new JButton("Kitchen");
		JButton office = new JButton("Office");
		JButton storageRoom = new JButton("Storage Room");
		menuPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
		menuPanel.add(text);
		menuPanel.add(cashRegister);
		menuPanel.add(kitchen);
		menuPanel.add(office);
		menuPanel.add(storageRoom);

		cardPanel.add(menuPanel, "1");
		cashRegister.addActionListener(new ActionListener() {//go to product interface
			public void actionPerformed(ActionEvent e) {
				cl.show(cardPanel, "2");
			}
		});
		
		kitchen.addActionListener(new ActionListener() {//go to product interface
			public void actionPerformed(ActionEvent e) {
				cl.show(cardPanel, "3");

			}
		});
		
		office.addActionListener(new ActionListener() {//go to product interface
			public void actionPerformed(ActionEvent e) {
				cl.show(cardPanel, "4");
			}
		});
		
		storageRoom.addActionListener(new ActionListener() {//go to product interface
			public void actionPerformed(ActionEvent e) {
				cl.show(cardPanel, "5");
			}
		});
	}
	public static void main(String[] args) {
		

	}
}
