import java.util.ArrayList;
import java.util.List;

public class StackOfStrings 
{
	 
	private ArrayList<String> strings;
	
	public void push(String item)
	{
		strings.add(item);
	}
	
	public String pop()
	{
		if (! isEmpty())
		{
			int i = strings.size();
			String out = strings.get(i-1);
			strings.remove(i-1);
			return out;
		}
		return null;
	}
	
	public boolean isEmpty()
	{
		return strings.isEmpty();
	}
	
	public StackOfStrings()
	{
		strings = new ArrayList<String>();
	}
	
	public int size()
	{
		return strings.size();
	}

}
