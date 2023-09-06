
public class VanillaCone extends Snacks{
	public VanillaCone(int count) {
		super(count);
		name = "vanilla cone";
		price = 1.79;
		container = "waffle cone";
		cookTime = 30 * count;
		addIngredients();
	}
	
	@Override
	public void addIngredients() {
		orderIngre.add("waffle cone");
		orderIngre.add("milk");
	}
}