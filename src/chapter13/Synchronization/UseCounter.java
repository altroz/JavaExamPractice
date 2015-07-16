package chapter13.Synchronization;

class UseCounter implements Runnable {
	public void increment() {
		// increments the counter and prints the value
		// of the counter shared between threads
		synchronized (this) {
			Counter.count++;
			System.out.print(Counter.count + " ");
		}
	}

	public void run() {
		increment();
		increment();
		increment();
	}
}
