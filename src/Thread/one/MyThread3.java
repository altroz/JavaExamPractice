package Thread.one;

public class MyThread3 implements Runnable {
	public void run() {
		System.out.println("In run method; thread name is: "
				+ Thread.currentThread().getName());

	}

	public static void main(String[] args) throws Exception {
		Thread myThread = new Thread(new MyThread3());
		myThread.run(); // not run() instead of start() here
		myThread.start();
		System.out.println("In main methodd; thread name is: "
				+ Thread.currentThread().getName());
	}
}
