package solution.generics;

import generics.Fibonacci;

import java.util.Iterator;

public class E07_IterableFibonacci implements Iterable<Integer> {

	private Fibonacci fib;

	private int n;

	public E07_IterableFibonacci(int count) {
		fib = new Fibonacci();
		n = count;
	}

	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			public boolean hasNext() {
				return n > 0;
			}

			public Integer next() {
				n--;
				return fib.next();
			}

			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}

	public static void main(String[] args) {
		for (int i : new E07_IterableFibonacci(18))
			System.out.print(i + " ");
	}
}