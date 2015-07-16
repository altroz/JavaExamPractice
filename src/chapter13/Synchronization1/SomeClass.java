package chapter13.Synchronization1;

public class SomeClass {
	private static int val;
	public static synchronized void assign(int i){
		val = i;
	}
}
