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
		for (Item items: items) {
			quantity += Item.getNumItems();	
			}
		
		return quantity;
	}



}
