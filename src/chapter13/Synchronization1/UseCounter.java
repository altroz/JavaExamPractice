package chapter13.Synchronization1;

public class UseCounter implements Runnable {
	public static void increment() {
		Counter.count++;
		System.out.println(Counter.count + " ");
	}

	public void run() {
		increment();
		increment();
		increment();
	}
}
