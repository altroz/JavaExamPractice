package Thread.two;

public class UseCounter implements Runnable {
	public static synchronized void increment() {
		Counter.count++;
		System.out.println(Counter.count + " ");
	}

	public void run() {
		increment();
		increment();
		increment();
	}
}
