package AssertionnException.one;

import java.util.Scanner;

public class ScanInt7 {
	public static void main(String[] args) {
		System.out.println("Type an integer in the console ");
		Scanner consoleScanner = new Scanner(System.in);
		try {
			System.out.println("You typed the integer value: "
					+ consoleScanner.nextInt());
		} catch (Exception e) {
			System.out.println("Error: Encountered an exception");
			System.out.println("Error: Exiting the program. ");
		} finally {
			System.out.println("Done reading the integer");
			consoleScanner.close();
		}
	}
}
