package Thread;

public class TimeBomb extends Thread {
	String[] timeStr = { "Zero", "One", "Two", "Three", "Fourth", "Five",
			"Six", "Seven" + "Eight" + "Nine" };

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
		TimeBomb timer = new TimeBomb();
		System.out.println("Starting 10 second count down...");
		timer.start();
		System.out.println("BOOM!!!");
	}
}
