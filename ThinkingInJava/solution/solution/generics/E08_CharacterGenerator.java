//: generics/coffee/CoffeeGenerator.java
// Generate different types of Coffee:
package solution.generics;

import java.util.Iterator;
import java.util.Random;

import net.mindview.util.Generator;

public class E08_CharacterGenerator implements Generator<Guy>, Iterable<Guy> {
	@SuppressWarnings("rawtypes")
	private Class[] types = { Guy.class, GoodGuys.class, BadGuys.class,
			Handsome.class, Belle.class, };
	private static Random rand = new Random(47);

	public E08_CharacterGenerator() {
	}

	// For iteration:
	private int size = 0;

	public E08_CharacterGenerator(int sz) {
		size = sz;
	}

	public Guy next() {
		try {
			return (Guy) types[rand.nextInt(types.length)].newInstance();
			// Report programmer errors at run time:
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	class CharacterIterator implements Iterator<Guy> {
		int count = size;

		public boolean hasNext() {
			return count > 0;
		}

		public Guy next() {
			count--;
			return E08_CharacterGenerator.this.next();
		}

		public void remove() { // Not implemented
			throw new UnsupportedOperationException();
		}
	};

	public Iterator<Guy> iterator() {
		return new CharacterIterator();
	}

	public static void main(String[] args) {
		E08_CharacterGenerator gen = new E08_CharacterGenerator();
		for (int i = 0; i < 5; i++)
			System.out.println(gen.next());
		for (Guy c : new E08_CharacterGenerator(5))
			System.out.println(c);
	}
}

class Guy {
	private static long counter = 0;
	private final long id = counter++;

	public String toString() {
		return getClass().getSimpleName() + " " + id;
	}
}

class GoodGuys extends Guy {
}

class BadGuys extends Guy {
}

class Handsome extends Guy {
}

class Belle extends Guy {
}
