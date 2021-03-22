import static org.junit.Assert.*;

import org.junit.Test;

import Project7.SimpleMath;

public class SimpleMathTest {
	
	@Test
	public void testThatZeroNumeratorReturnsZero() {
		SimpleMath m = new SimpleMath();
		assertEquals(0, m.divide(0, 7), 0);
	}
	
	@Test
	public void testThatSmallerNumeratorReturnsDecimalValue() {
		SimpleMath m = new SimpleMath();
		assertEquals(0.25, m.divide(1, 4), 0);
	}

	@Test(expected=ArithmeticException.class)
	public void testThatDenominatorThrowsException() {
		SimpleMath m = new SimpleMath();
		m.divide(7,0);
	}
}
