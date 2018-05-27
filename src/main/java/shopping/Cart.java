package shopping;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	List<Item> items = new ArrayList<>();

	public void addToCart(Item item) {
		items.add(item);
	}

	public int getTotalQuantity() {
		int quantity = 0;
		for (Item item : items) {
			quantity += item.getNumItems();
		}

		return quantity;
	}

	public void removeProduct(String productName) {
		for (int i = items.size() - 1; i >= 0; i--) {
			if (items.get(i).getProductName().equals(productName)) {
				items.remove(i);

			}

		}
	}

	public double getTotalPrice() {
		double price = 0;
		for (Item item : items) {
			price += item.getItemPrice();
		}
		return price;
	}

}
