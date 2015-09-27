import static org.junit.Assert.*;

import org.junit.Test;

public class StackOfStringsTest {

	@Test
	public void testPush() {
		 
		StackOfStrings s = new StackOfStrings();
		s.push("One");
		assertTrue(s.size()==1);
		
	}

	@Test
	public void testPop() {
		StackOfStrings s = new StackOfStrings();
		s.push("One");
		assertTrue(s.pop().equals("One"));
	}

	@Test
	public void testIsEmpty() {
	 	StackOfStrings s = new StackOfStrings();
		assertTrue(s.isEmpty());
		s.push("one");
		assertFalse(s.isEmpty());
		s.pop();
		assertTrue(s.isEmpty());
		
	}

	@Test
	public void testSize() {
		StackOfStrings s = new StackOfStrings();
		s.push("One");
		assertTrue(s.size()==1);
		s.push("Two");		 
		assertTrue(s.size()==2);
		
	}

}
