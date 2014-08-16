//: containers/FillingLists.java
// The Collections.fill() & Collections.nCopies() methods.
import java.util.*;

class StringAddress
{
	private String s;

	public StringAddress(String s)
	{
		this.s = s;
	}

	public String toString()
	{
		return super.toString() + " " + s;
	}
}

public class FillingLists
{
	public static void main(String[] args)
	{
		List<StringAddress> list = new ArrayList<StringAddress>(Collections.nCopies(4, new StringAddress("Hello")));
		System.out.println(list);
		Collections.fill(list, new StringAddress("World!"));
		System.out.println(list);
		int a = 1;
		try
		{
			assert a == 0;
			
		} catch (AssertionError e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(a);
	}
} /*
 * Output: (Sample) [StringAddress@82ba41 Hello, StringAddress@82ba41 Hello,
 * StringAddress@82ba41 Hello, StringAddress@82ba41 Hello] [StringAddress@923e30
 * World!, StringAddress@923e30 World!, StringAddress@923e30 World!,
 * StringAddress@923e30 World!]
 */// :~
