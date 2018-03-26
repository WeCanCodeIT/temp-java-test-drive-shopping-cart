package shopping;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.junit.Test;

public class CartItemTest {

	@Test
	public void shouldCalculateItemPrice() {
		Product product = new Product("42.00");
		CartItem underTest = new CartItem(product, 3);

		CurrencyAmount result = underTest.getPrice();

		assertThat(result, is(new CurrencyAmount("126.00")));
	}

	@Test(expected = BadQuantityException.class)
	public void shouldNotAllowNegativeQuantity() {
		Product product = new Product("42.00");
		new CartItem(product, -3);
	}

	@Test
	public void shouldNotAllowNegativeQuantityOldSchool() {
		try {
			Product product = new Product("42.00");
			new CartItem(product, -3);
			
			fail("Should have thrown exception.");
		} catch (BadQuantityException ex) {
			System.out.println("Yay! This is an implicit pass!");
		} finally {
			System.out.println("I'm done now!");
		}
	}
}
