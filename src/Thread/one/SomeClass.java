package Thread.one;

public class SomeClass {
	private static int val;

	public static synchronized void assing(int i) {
		val = i;
	}
}
