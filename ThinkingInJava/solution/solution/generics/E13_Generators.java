package solution.generics;

//: generics/Generators.java
// A utility to use with Generators.
import generics.coffee.Coffee;
import generics.coffee.CoffeeGenerator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import net.mindview.util.Generator;

public class E13_Generators {
	public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen,
			int n) {
		System.out.println("fill Collection<T>");
		for (int i = 0; i < n; i++)
			coll.add(gen.next());
		return coll;
	}

	public static <T> List<T> fill(List<T> list, Generator<T> gen, int n) {
		System.out.println("fill List<T>");
		for (int i = 0; i < n; i++)
			list.add(gen.next());
		return list;
	}

	public static <T> Queue<T> fill(Queue<T> queue, Generator<T> gen, int n) {
		System.out.println("fill Queue<T>");
		for (int i = 0; i < n; i++)
			queue.add(gen.next());
		return queue;
	}

	public static <T> LinkedList<T> fill(LinkedList<T> llist, Generator<T> gen,
			int n) {
		System.out.println("fill LinkedList<T>");
		for (int i = 0; i < n; i++)
			llist.add(gen.next());
		return llist;
	}

	public static void main(String[] args) {
		Collection<Coffee> coffee = fill(new ArrayList<Coffee>(),
				new CoffeeGenerator(), 4);
		for (Coffee c : coffee)
			System.out.println(c);
	}
}
