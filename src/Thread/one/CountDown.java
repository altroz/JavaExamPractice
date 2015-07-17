package Thread.one;

public class CountDown extends Thread {
	String[] timeStr = { "Zero", "One", "Two", "Three", "Four", "Five", "Six",
			"Seven", "Eight", "Nine" };

	public void run() {
		for (int i = 9; i >= 0; i--) {
			try {
				System.out.println(timeStr[i]);
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		CountDown counter = new CountDown();
		System.out.println("Starting 10 second count down");
		counter.start();
		System.out.println("GO!!!!");
	}
}
