import javax.swing.JOptionPane;

public class ApplePie extends Snacks{
	
	
	
	public ApplePie(int count) {
		super(count);
		name = "ApplePie"; 
		price = 1.19;
		container = "box";
		cookTime = 80 * count;
		addIngredients();
	}
	
	@Override
	public void addIngredients() {
		orderIngre.add("pie crust");
		orderIngre.add("sugar");
	}
}