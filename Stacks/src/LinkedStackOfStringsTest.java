import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedStackOfStringsTest {

	@Test
	public void testEmpty() 
	{
		LinkedStackOfStrings s = new LinkedStackOfStrings();
		assertTrue(s.isEmpty());
		s.push("one");
		assertFalse(s.isEmpty());
	}

	public void testPushEmtpy()
	{
		LinkedStackOfStrings s = new LinkedStackOfStrings();
		s.push("one");
		assertFalse(s.isEmpty());
	}
	
	public void testPush2()
	{
		LinkedStackOfStrings s = new LinkedStackOfStrings();
		s.push("one");
		s.push("two");
		s.push("three");
		assertFalse(s.isEmpty());
		assertTrue(s.pop().equals("three"));
		assertTrue(s.pop().equals("two"));
		assertTrue(s.pop().equals("one"));
		assertTrue(s.isEmpty());
	}
}
