//: operators/URShift.java
// Test of unsigned right shift.
import static net.mindview.util.Print.print;

public class URShift
{
	public static void main(String[] args)
	{
		int i = -1;
		print(Integer.toBinaryString(i));
		int a = -10;
		print("Integer.toBinaryString(a) :" + Integer.toBinaryString(a));
//		a >>>= 1;
		a >>= 1;
		print("Integer.toBinaryString(a) :" + Integer.toBinaryString(a));
		print("a :" + a);
		
		i >>>= 10;
		print(Integer.toBinaryString(i));
		print(i);
		long l = -1;
		print(Long.toBinaryString(l));
		l >>>= 10;
		print(Long.toBinaryString(l));
		short s = -1;
		print(Integer.toBinaryString(s));
		s >>>= 10;
		print(Integer.toBinaryString(s));
		byte b = -1;
		print(Integer.toBinaryString(b));
		b >>>= 10;
		print(Integer.toBinaryString(b));
		b = -1;
		print(Integer.toBinaryString(b));
		print(Integer.toBinaryString(b >>> 10));
	}
} /*
 * Output: 11111111111111111111111111111111 1111111111111111111111
 * 1111111111111111111111111111111111111111111111111111111111111111
 * 111111111111111111111111111111111111111111111111111111
 * 11111111111111111111111111111111 11111111111111111111111111111111
 * 11111111111111111111111111111111 11111111111111111111111111111111
 * 11111111111111111111111111111111 1111111111111111111111
 */// :~
