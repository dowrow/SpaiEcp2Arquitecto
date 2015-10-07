package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
	private Fraction fraction;
	private Fraction fraction2;

	@Before
	public void before() {
		fraction = new Fraction(1, 2);
	}

	@Test
	public void testGetNumerator() {
		assertEquals(fraction.getNumerator(), 1);
	}

	@Test
	public void testGetDenominator() {
		assertEquals(fraction.getDenominator(), 2);
	}

	@Test
	public void testDecimal() {
		assertEquals(fraction.decimal(), 0.5, 10e-5);
	}

	@Test
	public void testIsBiggerThan() {
		fraction2 = new Fraction(1, 3);
		assertEquals(true, fraction.isBiggerThan(fraction2));
	}
	
	@Test
	public void testMultiply(){
	    fraction2 = new Fraction(3, 2);
	    fraction2 = fraction.multiply(fraction2);
	    assertEquals(3, fraction2.getNumerator());
	    assertEquals(4, fraction2.getDenominator());
	}
}
