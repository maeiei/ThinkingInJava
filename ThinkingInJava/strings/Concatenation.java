//: strings/Concatenation.java

public class Concatenation
{
	public static void main(String[] args)
	{
		String mango = "mango";
		String s = "abc" + mango + "def" + 47;
		System.out.println(s);
		StringBuilder stringBuilder = new StringBuilder("abc");
		StringBuilder stringBuilder2 = stringBuilder.reverse();
		System.out.println(stringBuilder2);
	}
} /*
 * Output: abcmangodef47
 */// :~
