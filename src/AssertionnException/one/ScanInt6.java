package AssertionnException.one;

import java.util.Scanner;

public class ScanInt6 {
	public static void main(String[] args) {
		System.out.println("Type an integer in the console");
		Scanner consoleScanner = new Scanner(System.in);

		try {
			System.out.println("Yu typed the integer value: "
					+ consoleScanner.nextInt());
			System.out.println("Done reading the text... closing the Scanner");
			consoleScanner.close();
		} catch (Exception e) {
			System.out
					.println("Error: Encounted an exception and coule not read an integer from console");
			System.out
					.println("Exiting the program - restart and try the program again !");
		}
	}
}
