package AssertionnException.one;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScanIntHandled {
	public static void main(String[] args) {
		System.out.println("Type an integer in the console: ");
		Scanner consoleScanner = new Scanner(System.in);

		try {
			System.out.println("Your typed the integer value: "
					+ consoleScanner.nextInt());
		} catch (InputMismatchException ime) {
			// .nextInt() throws InputMisMatchException in case anything other
			// than an integer.
			// is typed in the console; so handle it.
			System.out
					.println("Error: You typed some text that is not an integer value. ");
			ime.printStackTrace();

			for (StackTraceElement methodCall : ime.getStackTrace()) {
				System.out.println(methodCall);
			}
		}
	}
}
