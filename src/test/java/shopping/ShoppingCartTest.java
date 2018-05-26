package shopping;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShoppingCartTest {

	@Test
	public void shouldReturnQuantityOfOne() {
		Cart underTest = new Cart();//1.to call from Cart Class
		underTest.addToCart(new Item("", 1));//2.done next to create Item Class and addToCart method
		int check = underTest.getTotalQuantity();//1.to create method to do the call from the Class
		
		assertEquals(1, check);		
	}
	
	@Test
	public void shouldReturnQuantityOfTwo() {
		Cart underTest = new Cart();
		underTest.addToCart(new Item("", 1));
		underTest.addToCart(new Item("", 1));
		int check = underTest.getTotalQuantity();
		
		assertEquals(2, check);
	}
}
