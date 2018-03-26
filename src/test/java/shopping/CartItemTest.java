package shopping;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import org.junit.Test;

public class CartItemTest {

	@Test
	public void shouldCalculateItemPrice() {
		Product product = new Product("42.00");
		CartItem underTest = new CartItem(product , 3);
		
		CurrencyAmount result = underTest.getPrice();
		
		assertThat(result, is(new CurrencyAmount("126.00")));
	}
}
