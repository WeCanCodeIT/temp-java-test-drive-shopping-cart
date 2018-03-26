package shopping;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.sameInstance;
import static org.junit.Assert.assertThat;

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
	
	@Test
	public void shouldAdd() {
		CurrencyAmount first = new CurrencyAmount("8.50");
		CurrencyAmount second = new CurrencyAmount("9.36");
		
		CurrencyAmount result = first.add(second);
		
		assertThat(result, isCurrencyAmount("17.86"));
	}
}
