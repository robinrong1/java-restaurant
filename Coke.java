import javax.swing.JOptionPane;

public class Coke extends Drinks{

	private String straw;
	
	public Coke(String size) {
		super(size);
		name = "coke";
		cookTime = 30;
		straw = "Straw";
		this.container = this.container + " and " + this.straw;
		addIngredients();
	}
	
	@Override
	public void addIngredients() {
		orderIngre.add("coke");
	}
}