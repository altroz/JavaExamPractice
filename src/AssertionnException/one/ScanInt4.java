package AssertionnException.one;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScanInt4 {
	public static void main(String[] args) {
		String intstr = " ";
		System.out.println("The string to scan integer from it is: " + intstr);
		Scanner consoleScanner = new Scanner(intstr);

		try {
			System.out.println("The integer scanned from string is: "
					+ consoleScanner.nextInt());
		} catch (InputMismatchException ime) {
			System.out
					.println("Error: Cannot scan an integer from the given string");
		} catch (NoSuchElementException nsee) {
			System.out
					.println("Error: Cannot scan an integer from the given string");
		} catch (IllegalStateException ise) {
			System.out
					.println("Eroor: nextInt() called on a closed Scanner object. ");
		}
	}
}
