import javax.swing.JOptionPane;

public class Chef extends EmpObj{

	public Chef() {
		
	}

	public void cookStart(String name) {
		JOptionPane.showMessageDialog(null, "Started cooking: " + name, "Chef", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	public void cookFinish(String name) {
		JOptionPane.showMessageDialog(null, name + " Cooked", "Chef", JOptionPane.INFORMATION_MESSAGE);
		
	}
}