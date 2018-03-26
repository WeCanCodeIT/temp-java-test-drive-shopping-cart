package shopping;

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
	
	public CartItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

}
