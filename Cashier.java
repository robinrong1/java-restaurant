import javax.swing.JOptionPane;

public class Cashier extends EmpObj{
	double totalRev = 0;
	double orderCost = 0;
	public Cashier() {
		
	}

	
	
	public void acceptPayment(double price) {
		totalRev = totalRev + price;
	}

	
	public void calCost(double price) {
		orderCost = orderCost + price;
	}
	
	public void orderPlaced() {
		JOptionPane.showMessageDialog(null, "Order placed! Please wait patiently", "Cashier", JOptionPane.INFORMATION_MESSAGE);
		
	}
	public double getTotalRev() {
		return totalRev;
	}



	public void setTotalRev(double totalRev) {
		this.totalRev = totalRev;
	}



	public double getOrderCost() {
		return orderCost;
	}



	public void setOrderCost(double orderCost) {
		this.orderCost = orderCost;
	}
	
}