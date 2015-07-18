package AssertionnException.one;

import java.util.Scanner;

public class ScanIntUnhandled {
	public static void main(String[] args) {
		System.out.println("Type an integer in the console: ");
		Scanner consoleScanner = new Scanner(System.in);
		System.out.println("You typed the integer value: "
				+ consoleScanner.nextInt());
	}
}
