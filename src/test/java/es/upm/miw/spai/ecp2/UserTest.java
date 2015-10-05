package es.upm.miw.spai.ecp2;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	private User user;
	
	@Before
	public void before(){
		user = new User(18, "Foo", "Bar");
	}
	
	@Test
	public void testFullName() {
		assertEquals(user.fullName(), "Foo Bar");
	}

	@Test
	public void testGetName(){
		assertEquals(user.getName(), "Foo");
	}
	
	@Test
	public void testGetFamilyName(){
		assertEquals(user.getFamilyName(), "Bar");
	}
	
	@Test
	public void testGetNumber(){
		assertEquals(user.getNumber(), 18);
	}
	
	@Test
	public void testInitials(){
		assertEquals(user.initials(), "F.");
	}
}
