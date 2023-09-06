import java.util.ArrayList;

import java.util.List;

import javax.swing.JOptionPane;



public abstract class Order {

	protected double price;
	protected String name;
	protected int cookTime;
	protected String container;
	protected List<Order> productList = new ArrayList<Order>();
	
	
	protected ArrayList<String> orderIngre = new ArrayList<String>();
	public Order() {

	}

	public String getContainer() {
		return container;
	}
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getCookTime() {
		return cookTime;
	}

	public void setCookTime(int cookTime) {
		this.cookTime = cookTime;
	}

	public List<Order> getProductList() {
		return productList;
	}

	public void setProductList(List<Order> productList) {
		this.productList = productList;
	}
/*
	public void fill(JProgressBar bar, int cookTime) {
		bar.setStringPainted(true);
		//display a number describing the process of the progress bar
		int counter = 0;
		while(counter <= cookTime) {
			//continuously repaint the progress bar, the larger of a number cookTime is, the more time it takes for the progress bar to fill up
			bar.setValue(counter);
			counter++;
			try {
				Thread.sleep(10);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
*/

	public ArrayList<String> getOrderIngre() {
		return orderIngre;
	}

	public void setOrderIngre(ArrayList<String> orderIngre) {
		this.orderIngre = orderIngre;
	}

	public void setContainer(String container) {
		this.container = container;
	}

	public void displayIngredients() {
		String output = "";
		for(int i = 0; i<orderIngre.size(); i++){
		    
		    String everything = orderIngre.get(i).toString();

		    output += everything + "\n";       
		}
		JOptionPane.showMessageDialog(null, "Ingredients used: \n" + output);
	}

	public void addIngredients() {
		//template method for overriding
	}
	
}