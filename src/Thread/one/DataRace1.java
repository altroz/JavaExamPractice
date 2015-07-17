package Thread.one;

public class DataRace1 {
	public static void main(String[] args) {
		UseCounter1 c = new UseCounter1();
		Thread a1 = new Thread(c);
		Thread a2 = new Thread(c);
		Thread a3 = new Thread(c);

		a1.start();
		a2.start();
		a3.start();
	}
}
