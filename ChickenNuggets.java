import javax.swing.JOptionPane;

public class ChickenNuggets extends Snacks{

	public ChickenNuggets(int count) {
		super(count);
		name = "chicken nuggets";
		price = 5.99;
		container = "box";
		cookTime = 90 * count;
		addIngredients();
	}
	
	@Override
	public void addIngredients() {
		orderIngre.add("chicken");
		orderIngre.add("bread");
	}
}