package ThreadExamples;

public class DataRace {
	public static void main(String[] args) {
		UseCounter c = new UseCounter();
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		Thread t3 = new Thread();

		t1.start();
		t1.start();
		t3.start();
	}
}
