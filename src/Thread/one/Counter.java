package Thread.one;

//this class exposes a publicly accessible counter
// to help demostrate data race problem. 
public class Counter {

	public static long count = 0;
}
