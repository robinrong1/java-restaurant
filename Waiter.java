import javax.swing.JOptionPane;

public class Waiter extends EmpObj{

	public Waiter() {
		
	}
	
	public void serve(String name, String container) {
		JOptionPane.showMessageDialog(null, name + " served to customer in a " + container, "Waiter", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
}