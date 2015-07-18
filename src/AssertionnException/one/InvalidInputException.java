package AssertionnException.one;

public class InvalidInputException extends RuntimeException {
	public InvalidInputException(String str) {
		super(str);
	}

	public InvalidInputException(Throwable originalException) {
		super(originalException);
	}

	public InvalidInputException(String str, Throwable originalException) {
		super(str, originalException);
	}
}
