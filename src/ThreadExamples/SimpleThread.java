package ThreadExamples;

public class SimpleThread {
	public static void main(String[] args) {
		Thread t = new Thread();
		t.setName("SimpleThread");
		t.setPriority(9);
		System.out.println(t);
	}
}
