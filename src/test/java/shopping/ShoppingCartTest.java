package shopping;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShoppingCartTest {

	@Test
	public void shouldReturnQuantityOfOne() {
		Cart underTest = new Cart();// 1.to call from Cart Class
		underTest.addToCart(new Item("", 0, 1));// 2.done next to create Item Class and addToCart method
		int check = underTest.getTotalQuantity();// 1.to create method to do the call from the Class

		assertEquals(1, check);
	}

	@Test
	public void shouldReturnQuantityOfTwo() {
		Cart underTest = new Cart();
		underTest.addToCart(new Item("", 0, 1));
		underTest.addToCart(new Item("", 0, 1));
		int check = underTest.getTotalQuantity();

		assertEquals(2, check);
	}

	@Test
	public void shouldReturnQuantityOfThree() {
		Cart underTest = new Cart();
		underTest.addToCart(new Item("", 0, 2));
		underTest.addToCart(new Item("", 0, 1));
		int check = underTest.getTotalQuantity();

		assertEquals(3, check);
	}

	@Test
	public void shouldReturnQuantityOfOneAfterRemoval() {
		Cart underTest = new Cart();
		underTest.addToCart(new Item("shirt", 0, 1));
		underTest.addToCart(new Item("shoes", 0, 1));
		underTest.removeProduct("shirt");
		int check = underTest.getTotalQuantity();

		assertEquals(1, check);

	}

	@Test
	public void shouldReturnQuantityOfOneAfterRemovalOfAllShirts() {
		Cart underTest = new Cart();
		underTest.addToCart(new Item("shirt", 0, 1));
		underTest.addToCart(new Item("shirt", 0, 1));
		underTest.addToCart(new Item("shoes", 0, 1));
		underTest.removeProduct("shirt");
		int check = underTest.getTotalQuantity();

		assertEquals(1, check);

	}

	@Test
	public void priceShouldBeFive() {
		Cart underTest = new Cart();
		double check = underTest.getTotalPrice();

		assertEquals(5, check, 0);
	}
	
	@Test
	public void totalPriceShouldBeSixAfterTwoItemsInCart() {
		Cart underTest = new Cart();
		underTest.addToCart(new Item("", 5, 0));
		underTest.addToCart(new Item("", 1, 0));
		double check = underTest.getTotalPrice();
		
		assertEquals(6, check, 0);

	}
}
