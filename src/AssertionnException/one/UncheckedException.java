package AssertionnException.one;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UncheckedException {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream(args[0]);
	}
}
