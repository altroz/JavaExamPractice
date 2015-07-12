package collection.hashCode;

public class HashTest {
	public int x;

	HashTest(int xVal) {
		x = xVal;
	}

	public boolean equals(Object o) {
		HashTest h = (HashTest) o;

		if (h.x == this.x) {
			return true;
		} else
			return false;
	}

	public int hashCode() {
		return (x * 17);
	}
}
