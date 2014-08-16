//: typeinfo/ClassInitialization.java
import java.util.Random;

class Initable
{
	static final int staticFinal = 47;//1
	static final int staticFinal2 = ClassInitialization.rand.nextInt(1000); //3
	static
	{
		System.out.println("Initializing Initable");//2
	}
}

class Initable2
{
	static int staticNonFinal = 147;//5
	static
	{
		System.out.println("Initializing Initable2");//4
	}
}

class Initable3
{
	static int staticNonFinal = 74;//8
	static
	{
		System.out.println("Initializing Initable3");//7
	}
}

public class ClassInitialization
{
	public static Random rand = new Random(47);

	public static void main(String[] args) throws Exception
	{
		Class initable = Initable.class;
		System.out.println("After creating Initable ref");
		// Does not trigger initialization:
		System.out.println(Initable.staticFinal);
		// Does trigger initialization:
		System.out.println(Initable.staticFinal2);
		// Does trigger initialization:
		System.out.println(Initable2.staticNonFinal);
		Class initable3 = Class.forName("Initable3");
		System.out.println(Initable3.staticNonFinal);
		System.out.println("After creating Initable3 ref");
		
	}
} /*
 * Output: After creating Initable ref 47 Initializing Initable 258 Initializing
 * Initable2 147 Initializing Initable3 After creating Initable3 ref 74
 */// :~
