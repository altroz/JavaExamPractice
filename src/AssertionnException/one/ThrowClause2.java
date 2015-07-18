package AssertionnException.one;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowClause2 {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Reading an integer from the file");
		Scanner consoleScanner = new Scanner(new File("integer.txt"));
		System.out.println("You typed the integer value:"
				+ consoleScanner.nextInt());
	}
}
