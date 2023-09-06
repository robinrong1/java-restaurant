import javax.swing.JOptionPane;

public class Fries extends Order{

	protected String size;//large, medium, small

	
	public Fries(String size) {
		this.size = size;
		name = "french fries";
		price = 1.69;
		cookTime = 120;
		container = "box";
		if(size == "Large") {
			
			price = 3.19;
		}
		else if(size == "Medium") {
			
			price = 2.49;
		}
		else if(size == "Small") {
			
			price = 1.69;
		}
		addIngredients();
	}
	
	@Override
	public void addIngredients() {
		orderIngre.add("potato");
	}
}