package shopping;

public class Item {

	private int productQuantity;
	private String productName;
	private double productCost;

	// Constructor
	public Item(String productName, double productCost, int productQuantity) {
		this.productQuantity = productQuantity;
		this.productName = productName;
		this.productCost = productCost;

	}

	// Accessor

	public String getProductName() {
		return productName;
	}

	public int getNumItems() {

		return productQuantity;
	}

	public double getItemPrice() {

		return productCost;
	}

}
