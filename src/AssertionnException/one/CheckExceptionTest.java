package AssertionnException.one;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckExceptionTest {
	public static void main(String[] args) {
		try {
			FileInputStream fs = new FileInputStream(args[0]);
		} catch (FileNotFoundException fnfe) {
			System.out.println("Error: no file found");
			System.out.println("Pass a valid file name");
		}
	}
}
