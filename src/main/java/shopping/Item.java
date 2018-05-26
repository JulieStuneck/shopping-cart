package shopping;

public class Item {

	private int productQuantity;

	public Item(String productName, int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public int getNumItems() {
	
		return productQuantity;
	}

}
