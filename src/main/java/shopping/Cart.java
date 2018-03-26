package shopping;

import java.util.ArrayList;
import java.util.Collection;

public class Cart {

	private Collection<CartItem> cartItems = new ArrayList<>();
	
	public void addProduct(Product toAdd, int qty) {
		cartItems.add(new CartItem(toAdd, qty));
	}

	public boolean contains(Product product) {
		for (CartItem item : cartItems) {
			if(item.isAssociatedWith(product)) {
				return true;
			}
		}
		return false;
	}

	public CurrencyAmount getPrice() {
		CurrencyAmount total = CurrencyAmount.ZERO;
		for (CartItem item: cartItems) {
			total = total.add(item.getPrice());
		}
		return total;
	}

}
