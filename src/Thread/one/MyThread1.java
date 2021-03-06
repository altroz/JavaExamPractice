package Thread.one;

public class MyThread1 extends Thread {
	public void run() {
		try {
			sleep(1000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}

		System.out.println("In run method; thread name is: " + getName());
	}

	public static void main(String[] args) {
		Thread myThread = new MyThread1();
		myThread.start();
		System.out.println("In main method; thread name is: "
				+ Thread.currentThread().getName());
	}
}
