package shopping;

import java.math.BigDecimal;

/**
 * This is (or will be) an immutable money wrapper.
 */
public class CurrencyAmount {

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

}
