package AssertionnException.one;

public class ExceptionTemplate {
	public static void foo() /* throws ACheckedException */{
		try {
			// some code that can throw an exception
		} catch (Exception e) {
			// handles the exception
		} finally {
			// releases resources accquired in the try block.
		}
	}
}
