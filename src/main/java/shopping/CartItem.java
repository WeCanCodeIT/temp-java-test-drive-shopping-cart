package shopping;

import static java.math.BigDecimal.valueOf;

import java.math.BigDecimal;

public class CartItem {

	private Product product;
	private int quantity;

	public Product getProduct() {
		return product;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public BigDecimal getUnitPrice() {
		return product.getPrice();
	}
	
	public CurrencyAmount getPrice() {
		return new CurrencyAmount(getUnitPrice()).multiply(quantity);
	}

	public CartItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	public boolean isAssociatedWith(Product product) {
		return this.product.equals(product);
	}
}
