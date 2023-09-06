

public class Burgers extends Order{

	String patty;
	boolean pickles;
	boolean cheese;
	String vegetable;

	public Burgers(String patty, boolean pickles, boolean cheese, String vegetable) {
		this.patty = patty;
		this.pickles = pickles;
		this.cheese = cheese;
		this.vegetable = vegetable;
		name = "burger";
		price = 6.99;
		cookTime = 100;
		container = "wrapping paper";

		addIngredients();
	}
	
	@Override
	public void addIngredients() {
		if(patty == "Beef") {
			orderIngre.add("beef patty");
		}
		else if(patty == "Chicken") {
			orderIngre.add("chicken patty");
		}
		else if(patty == "Pork") {
			orderIngre.add("pork patty");
		}
		else if(patty == "Fish") {
			orderIngre.add("fish patty");
		}
		
		if(pickles == true) {
			orderIngre.add("pickles");
		}
		if(cheese == true) {
			orderIngre.add("cheese");
		}
		if(vegetable == "Lettuce") {
			orderIngre.add("lettuce");
		}
		else if(patty == "Red Cabbage") {
			orderIngre.add("red cabbage");
		}
		else if(patty == "Onions") {
			orderIngre.add("onion");
		}
	}
}