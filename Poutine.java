import javax.swing.JOptionPane;

public class Poutine extends Fries{
	public Poutine(String size) {
		super(size);
		name = "poutine";
		
		cookTime = 100;
		container = "tray";
		if(size == "Large") {
			
			price = 4.59;
		}
		else if(size == "Medium") {
			
			price = 3.99;
		}
		else if(size == "Small") {
			
			price = 3.19;
		}
	}
	
	@Override
	public void addIngredients() {
		orderIngre.add("gravy");
		orderIngre.add("cheese");
		orderIngre.add("potato");
	}
}