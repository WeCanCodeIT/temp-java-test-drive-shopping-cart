package shopping;

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
		this.product = product;
		this.quantity = quantity;
	}
	
	public boolean isAssociatedWith(Product product) {
		return this.product.equals(product);
	}
}
