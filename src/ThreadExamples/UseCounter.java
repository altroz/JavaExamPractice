package ThreadExamples;

public class UseCounter implements Runnable {
	public void increment() {
		// increments the counter and prints the value;
		// of the counter shared between threads
		Counter.count++;
		System.out.print(Counter.count + " ");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		increment();
		increment();
		increment();
	}
}
