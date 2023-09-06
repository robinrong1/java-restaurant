import javax.swing.JOptionPane;

public class HashBrowns extends Snacks{

	public HashBrowns(int count) {
		super(count);
		name = "hashbrowns";
		container = "paper bag";
		price = 1.79;
		cookTime = 100 * count;
	addIngredients();
	}
	
	
	@Override
	public void addIngredients() {
		orderIngre.add("potato");
	}
}