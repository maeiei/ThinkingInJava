package solution.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class E03_Runnable2 implements Runnable {

	public static void main(String[] args) {
		System.out.println("All start.");
		//ExecutorService executor = Executors.newCachedThreadPool();
		//ExecutorService executor = Executors.newFixedThreadPool(2);
		ExecutorService executor = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 5; i++) {
			executor.execute(new E01_Runnable());
		}
		executor.shutdown();
		System.out.println("All finish.");
	}

	@Override
	public void run() {
		System.out.println(this + "run()");
		Thread.yield();
		System.out.println(this + "run()");
		Thread.yield();
		System.out.println(this + "run()");
		Thread.yield();
	}
}
