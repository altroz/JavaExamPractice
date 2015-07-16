package ThreadExamples;

import java.lang.*;

class TimeBomb extends Thread {
	String[] timeStr = { "zero", "one", "two", "three", "four", "five", "six",
			"seven", "eight", "nine" };

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
		System.out.println("Starting 10 seconds count down");
		timer.start();
		try {
			timer.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("BOMMMMM!");
	}
}