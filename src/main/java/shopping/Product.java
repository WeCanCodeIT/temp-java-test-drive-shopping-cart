package shopping;

import java.math.BigDecimal;

public class Product {

	private BigDecimal price;

	public Product(BigDecimal price) {
		this.price = price;
	}

	public Product(String price) {
		this(new BigDecimal(price));
	}

	public BigDecimal getPrice() {
		return price;
	}

}
