package AssertionnException.one;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckExceptionTest {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fs = new FileInputStream(args[0]);
	}
}
