package generic.one;

public class TestClass {
	private int TestClassValue;

	TestClass(int val) {
		TestClassValue = val;
	}

	public int getTestClassValue() {
		return TestClassValue;
	}

	public boolean equal(Object o) {
		if ((o instanceof TestClass)
				&& (((TestClass) o).getTestClassValue() == this.TestClassValue))
			return true;
		else
			return false;
	}
}
