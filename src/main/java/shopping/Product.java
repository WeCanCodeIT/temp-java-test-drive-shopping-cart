package shopping;

public class Product {

	private CurrencyAmount price;

	public Product(CurrencyAmount price) {
		this.price = price;
	}

	public Product(String price) {
		this(new CurrencyAmount(price));
	}

	public CurrencyAmount getPrice() {
		return price;
	}

}
