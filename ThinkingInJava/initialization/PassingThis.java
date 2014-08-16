//: initialization/PassingThis.java

class Person1
{
	public void eat(Apple1 apple)
	{
		Apple1 peeled = apple.getPeeled();
		System.out.println("Yummy");
	}
}

class Peeler
{
	static Apple1 peel(Apple1 apple)
	{
		// ... remove peel
		return apple; // Peeled
	}
}

class Apple1
{
	Apple1 getPeeled()
	{
		return Peeler.peel(this);
	}
}

public class PassingThis
{
	public static void main(String[] args)
	{
		new Person1().eat(new Apple1());
	}
} /*
 * Output: Yummy
 */// :~
