package shopping;

public class BadQuantityException extends RuntimeException {

	public BadQuantityException(int quantity) {
		super(quantity + " is not a valid quantity");
	}

}
