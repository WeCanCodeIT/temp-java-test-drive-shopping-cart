package shopping;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.sameInstance;
import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import org.hamcrest.Matcher;
import org.junit.Test;

public class CurrencyAmountTest {

	@Test
	public void shouldOfferValue() {
		CurrencyAmount underTest = new CurrencyAmount("86.00");
		
		assertThat(underTest, isCurrencyAmount("86.00"));
	}

	private Matcher<CurrencyAmount> isCurrencyAmount(String amount) {
		return is(new CurrencyAmount(amount));
	}
	
	@Test
	public void shouldMultiply() {
		CurrencyAmount underTest = new CurrencyAmount("14.00");
		
		int multiplier = 3;
		CurrencyAmount result = underTest.multiply(multiplier);
		
		assertThat(result, isCurrencyAmount("42.00"));
	}
	
	@Test
	public void shouldBeImmutable() {
		CurrencyAmount underTest = new CurrencyAmount("7.00");
		
		CurrencyAmount result = underTest.multiply(2);
		
		assertThat(result, is(not(sameInstance(underTest))));
		assertThat(result, isCurrencyAmount("14.00"));
	}
}
