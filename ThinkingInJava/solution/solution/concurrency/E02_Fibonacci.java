package solution.concurrency;

import java.util.Arrays;
import java.util.concurrent.Callable;

import net.mindview.util.Generator;

class Fibonacci implements Generator<Integer>, Runnable, Callable<Integer> {
	private int count;
	private final int n;

	public Fibonacci(int n) {
		this.n = n;
	}

	public Integer next() {
		return fib(count++);
	}

	private int fib(int n) {
		if (n < 2)
			return 1;
		return fib(n - 2) + fib(n - 1);
	}

	public void run() {
		Integer[] sequence = new Integer[n];
		for (int i = 0; i < n; i++)
			sequence[i] = next();
		System.out.println("Seq. of " + n + ": " + Arrays.toString(sequence));
	}

	@Override
	public Integer call() throws Exception {
		return next();
	}
}

public class E02_Fibonacci {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++)
			new Thread(new Fibonacci(i)).start();
	}
}
