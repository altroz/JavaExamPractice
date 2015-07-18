package AssertionnException.one;

import java.util.Scanner;

public class TryWithResource2 {
	public static void main(String[] args) {
		System.out.println("Type an integer in the console");
		try (Scanner consoleScanner = new Scanner(System.in)) {
			System.out.println("You type an integer value"
					+ consoleScanner.nextInt());
		}
	}
}
