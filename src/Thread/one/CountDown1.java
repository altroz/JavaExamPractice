package Thread.one;

public class CountDown1 extends Thread {
	String[] timer = { "zero", "one", "two", "three", "four", "five", "six",
			"seven", "eight", "nine" };

	public void run() {
		for (int i = 9; i >= 0; i--) {
			try {
				System.out.println(timer[i]);
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		CountDown1 counter = new CountDown1();
		System.out.println("Starting 10 second count down");
		counter.start();
		try {
			counter.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("GOOOOO !!!!!");
	}
}
