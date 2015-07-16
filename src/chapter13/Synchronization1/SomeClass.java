package chapter13.Synchronization1;

public class SomeClass {
	private static int val;

	public static void assign(int i) {
		synchronized (SomeClass.class) {
			val = i;
		}
	}
}
