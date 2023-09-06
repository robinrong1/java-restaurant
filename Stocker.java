import java.util.HashMap;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Stocker extends EmpObj{

	public Stocker() {
		
	}

	public void restock(String name, HashMap<String, Integer> ingredients, JLabel label) {
		ingredients.put(name, 100);
		JOptionPane.showMessageDialog(null, name + " restocked", "Stocker", JOptionPane.INFORMATION_MESSAGE);
		label.setText(name + ": " + ingredients.get(name));
	}
}
