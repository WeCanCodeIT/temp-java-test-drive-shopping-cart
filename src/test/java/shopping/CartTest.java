package shopping;

import static java.math.BigDecimal.ZERO;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import org.junit.Test;

public class CartTest {

	@Test
	public void shouldAddItemToCart() {
		Cart underTest = new Cart();
		Product toAdd = new Product(ZERO);

		underTest.addProduct(toAdd, 42);

		assertThat(underTest.contains(toAdd), is(true));
	}

	@Test
	public void shouldNotContainProduct() {
		Cart underTest = new Cart();
		Product p = new Product(ZERO);

		assertThat(underTest.contains(p), is(false));
	}

	@Test
	public void shouldComputePriceForOneProduct() {
		Cart underTest = new Cart();

		Product thingOne = new Product("42.00");
		underTest.addProduct(thingOne, 2);

		assertThat(underTest.getPrice(), is(new BigDecimal("84.00")));
	}

	@Test
	public void shouldComputeTotalPrice() {
		Cart underTest = new Cart();

		Product thingOne = new Product("42.00");
		underTest.addProduct(thingOne, 2);
		Product thingTwo = new Product("0.11");
		underTest.addProduct(thingTwo, 1);

		assertThat(underTest.getPrice(), is(new BigDecimal("84.11")));
	}
}
