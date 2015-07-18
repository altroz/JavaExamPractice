package AssertionnException.one;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScanInt3 {
	public static void main(String[] args) {
		String integerStr = "100";
		System.out.println("The string to scane integer from it is: "
				+ integerStr);
		Scanner consoleScanner = new Scanner(integerStr);

		try {
			System.out.println("The integer value scanned from string is: "
					+ consoleScanner.nextInt());
		} catch (InputMismatchException ime) {
			// nextInt() method throw InputMisMatchException in case anything
			// other than an integer.
			// is provided in the string.

			System.out
					.println("Error: Cannot scan an integer from the given string");
		}
	}
}
