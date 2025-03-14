import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


public class IsAssignableTest {

	public static class Base {}
	
	public static class Derived extends Base {}
	
	@Test 
	public void testEquality() {
		assertTrue(Base.class.isAssignableFrom(Base.class));
	}
	
	@Test 
	public void testSubclass() {
		assertTrue(Base.class.isAssignableFrom(Derived.class));
	}
	
	@Test 
	public void testNotSubclass() { 
		assertFalse(Base.class.isAssignableFrom(String.class));
	}
	
}
