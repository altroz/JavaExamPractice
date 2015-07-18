package generic.one;

public class BoxPrinter {
	private Object val;

	public BoxPrinter(Object args) {
		val = args;
	}

	public String toString() {
		return "[" + val + "]";
	}
}
