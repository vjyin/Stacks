import static org.junit.Assert.*;

import org.junit.Test;

public class StackOfItemsTest {

	@Test
	public void testEmptyInteger()
	{
		StackOfItems<Integer> ints = new StackOfItems<Integer>();
		ints.push(2);
		assertFalse(ints.isEmpty());
	}

	@Test
	public void testEmptyString()
	{
		StackOfItems<String> ints = new StackOfItems<String>();
		ints.push("2");
		assertFalse(ints.isEmpty());
	}

	@Test
	public void testPushInteger()
	{
		StackOfItems<Integer> ints = new StackOfItems<Integer>();
		ints.push(2);
		assertTrue(2==ints.pop());
				
	}
}
