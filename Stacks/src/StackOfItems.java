import java.util.ArrayList;
import java.util.Iterator;

public class StackOfItems<Item> 
{
	private ArrayList<Item> a = new ArrayList<Item>();
	
	public boolean isEmpty()
	{
		if (a.size()==0)
		{
			return true;
		}
		return false;
	}
	
	public void push(Item data)
	{
		a.add(data);
	}
	
	public Item pop()
	{
		if (!isEmpty())
		{
			int size = a.size();
			Item toReturn = a.get(size-1);
			a.remove(size-1);
			return toReturn;
		}
		else
		{
			return null;
		}
	}
	
	public Iterator<Item> iterator()
	{
		return new StackOfItemsIterator();
	}
	
	private class StackOfItemsIterator implements Iterator<Item>
	{
		public boolean hasNext()
		{
			if (! isEmpty())
				return true;
			else
				return false;
		}
		
		public Item next()
		{
			return pop();
		}
	
	}
	
	
}

