import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rudolph
{
	public static void main(String[] args)
	{
		Pattern pattern = Pattern.compile("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");
		Matcher matcher = pattern.matcher("aedifds asfdsf esfsdfdsfds tythgf dfsf");
		while(matcher.find())
		{
			System.out.println(matcher.group());
		}
		
		// for (String pattern : new String[] { "(R)?+.*", "[rR]udolph",
		// "[rR][aeiou]{1,}[a-z]ol|.*", "R.*" })
		// {
		// System.out.println("Ru".matches(pattern));
		// // System.out.println("Rudolph".matches(pattern));
		// }
	}
} /*
 * Output: true true true true
 */// :~
