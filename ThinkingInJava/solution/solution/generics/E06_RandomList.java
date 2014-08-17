package solution.generics;

import java.util.ArrayList;
import java.util.Random;

import net.mindview.util.CountingGenerator;
import net.mindview.util.Generator;

public class E06_RandomList<T> {
	private ArrayList<T> storage = new ArrayList<T>();
	private Random rand = new Random(47);

	public void add(T item) {
		storage.add(item);
	}

	public T select() {
		return storage.get(rand.nextInt(storage.size()));
	}

	public static void main(String[] args) {
		E06_RandomList<String> rs = new E06_RandomList<String>();
		for (String s : ("The quick brown fox jumped over "
				+ "the lazy brown dog").split(" "))
			rs.add(s);
		dump(rs);
		E06_RandomList<Integer> ri = new E06_RandomList<Integer>();
		Generator<Integer> gi = new CountingGenerator.Integer();
		for (int i = 0; i < 11; i++)
			ri.add(gi.next());
		dump(ri);
		E06_RandomList<Character> rc = new E06_RandomList<Character>();
		Generator<Character> gc = new CountingGenerator.Character();
		for (int i = 0; i < 11; i++)
			rc.add(gc.next());
		dump(rc);
	}

	private static void dump(E06_RandomList<?> rs) {
		for (int i = 0; i < 11; i++)
			System.out.print(rs.select() + " ");
		System.out.println("");
	}
}
