package solution.concurrency;

public class E01_Runnable implements Runnable {

	public static void main(String[] args) {
		System.out.println("All start.");
		for (int i = 0; i < 5; i++) {
			new Thread(new E01_Runnable()).start();
		}
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
