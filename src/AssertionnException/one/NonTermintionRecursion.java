package AssertionnException.one;

public class NonTermintionRecursion {
	static int factorial(int x) {
		int result = 0;
		result = factorial(x - 1) * x;
		return result;
	}

	public static void main(String[] args) {
		System.out.println("factorial of 4 is: " + factorial(4));
	}
}
