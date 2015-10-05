package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {
	private DecimalCollection decimalCollection;
	
	@Before
	public void before(){
		decimalCollection = new DecimalCollection();
	}
	
	@Test
	public void testAdd() {
		decimalCollection.add(0.0);
		decimalCollection.add(1.0);
		assertEquals(decimalCollection.size(), 2);
	}
	
	@Test
	public void testSize(){
		decimalCollection.add(1.0);
		assertEquals(decimalCollection.size(), 1);
	}
	
	@Test
	public void testSum() {
		decimalCollection.add(1.0);
		decimalCollection.add(2.0);
		assertEquals(decimalCollection.sum(), 3, 10e-5);
	}
	
	@Test
	public void testHigher() {
		decimalCollection.add(1.0);
		decimalCollection.add(2.0);
		assertEquals(decimalCollection.higher(), 2, 10e-5);
	}
}
