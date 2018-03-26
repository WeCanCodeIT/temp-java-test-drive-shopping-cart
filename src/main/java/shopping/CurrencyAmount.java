package shopping;

import java.math.BigDecimal;

/**
 * This is (or will be) an immutable money wrapper.
 */
public class CurrencyAmount {

	public static final CurrencyAmount ZERO = new CurrencyAmount("0.00");

	private final BigDecimal amount;

	public CurrencyAmount(String amount) {
		this(new BigDecimal(amount));
	}

	public CurrencyAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getValue() {
		return amount;
	}

	public CurrencyAmount multiply(int multiplier) {
		BigDecimal result = amount.multiply(BigDecimal.valueOf(multiplier));
		return new CurrencyAmount(result);
	}

	@Override
	public int hashCode() {
		return amount.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		CurrencyAmount other = (CurrencyAmount) obj;
		if ((amount == null && other.amount != null)) {
			return false;
		} else if (!amount.equals(other.amount)) {
			return false;
		}
		return true;
	}

	public CurrencyAmount add(CurrencyAmount other) {
		return new CurrencyAmount(amount.add(other.amount));
	}

	@Override
	public String toString() {
		return "CurrencyAmount: " + amount;
	}

}
