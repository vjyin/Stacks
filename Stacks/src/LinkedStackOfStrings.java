
public class LinkedStackOfStrings 
{
	private Node first = null;
	
	public LinkedStackOfStrings()
	{ 
		first = null;
	}
	private class Node
	{
		String item;
		Node next;
	}
	
	public String pop() 
	{
		String data = first.item;
		Node x = first;
		first = first.next;  
		x = null;
		return data;
	}
	
	public void push(String data)
	{
		if (first == null)
		{
			first = new Node();
			first.item = data;
			first.next = null;
		}
		else
		{
			Node n = new Node();
			n.item = data;
			n.next = null;
			first.next = n;
		}
	}
	 
	public boolean isEmpty()
	{
		return first == null;
	}

}
