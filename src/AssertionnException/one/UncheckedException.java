package AssertionnException.one;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UncheckedException {
	public static void main(String[] args) throws FileNotFoundException {
		try {
			FileInputStream fis = new FileInputStream(args[0]);
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("No error: No Argument");
			System.out.println("Pass the name of the file");
		}
	}
}
