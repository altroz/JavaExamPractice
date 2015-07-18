package AssertionnException.one;

public class AssertTypeTest {

	void methodOne(int x, int y) {
		// Type One: Really Simple
		assert (y < x);

		// Type Two: Simple
		assert (y > x) : "y is " + y + " x is " + x;
	}
}
