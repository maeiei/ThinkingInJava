package solution.generics;

//: generics/BasicGeneratorDemo.java
import generics.CountedObject;
import net.mindview.util.BasicGenerator;
import net.mindview.util.Generator;

public class E14_BasicGeneratorDemo {
	public static void main(String[] args) {
		Generator<CountedObject> genCon = new BasicGenerator<CountedObject>(
				CountedObject.class);
		for (int i = 0; i < 5; i++)
			System.out.println(genCon.next());
	}
}
