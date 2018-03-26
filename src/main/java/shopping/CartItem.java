package shopping;

import java.io.IOException;

public class CartItem {

	private Product product;
	private int quantity;

	public Product getProduct() {
		return product;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public CurrencyAmount getUnitPrice() {
		return product.getPrice();
	}
	
	public CurrencyAmount getPrice() {
		return getUnitPrice().multiply(quantity);
	}

	public CartItem(Product product, int quantity) {
		if(quantity < 0) {
			throw new BadQuantityException(quantity);
		}
		this.product = product;
		this.quantity = quantity;
	}
	
	public boolean isAssociatedWith(Product product) {
		return this.product.equals(product);
	}

	/**
	 * This throws a checked exception.
	 */
	public void writeToFile() throws IOException {
		throw new IOException("Can't do this!");
	}
}
