//: exceptions/AlwaysFinally.java
// Finally is always executed.
import static net.mindview.util.Print.print;

class FourException extends Exception
{
}

public class AlwaysFinally
{
	public static void main(String[] args)
	{
		print("Entering first try block");
		try
		{
			print("Entering second try block");
			try
			{
				throw new FourException();

			} catch (FourException e)
			{
				// TODO: handle exception
				System.out.println("Caught FourException in 1st try block");

			} finally
			{
				print("finally in 2nd try block");
			}
			throw new Exception();

		} catch (Exception e)
		{
			System.out.println("Exception in 1st try block");

		} finally
		{
			System.out.println("finally in 1st try block");
		}
	}
} /*
 * Output: Entering first try block Entering second try block finally in 2nd try
 * block Caught FourException in 1st try block finally in 1st try block
 */// :~
