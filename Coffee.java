import javax.swing.JOptionPane;

public class Coffee extends Drinks{

	private boolean iced;
	
	public Coffee(String size, boolean iced) {
		super(size);
		name = "coffee";
		this.iced = iced;
		cookTime = 40;
		addIngredients();
		
	}
	
	@Override
	public void addIngredients() {
		orderIngre.add("coffee");
		if(iced == true) {
		orderIngre.add("ice");
		}
	}
}