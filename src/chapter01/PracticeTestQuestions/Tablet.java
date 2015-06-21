package chapter01.PracticeTestQuestions;

public class Tablet extends Electronics implements Gadget{
	public void doStuff(){System.out.println("Show Book  ");}
	public static void main(String[] args){
		new Tablet().getPower();
		new Tablet().doStuff();
	}
}
