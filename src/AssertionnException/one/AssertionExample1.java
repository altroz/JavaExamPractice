package AssertionnException.one;

public class AssertionExample1 {
	public static void main(String[] args) {
		int i = Integer.MIN_VALUE;
		if (i < 0) {
			// if negative value. cnvert into positive value
			
		}
		System.out.println("the value of i is " + i);
		// at this point the assumption is that i cannot be negative.
		assert (i >= 0) : "impossible: i is negative. ";
	}
}
