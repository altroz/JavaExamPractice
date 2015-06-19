package chapter02.Polymorphism5;

public class FerrariTest {
	public static void main(String[] args){
		Ferrari f = new Ferrari();
		f.drive("Central Union Station");
		
		/*The above drive method will invoke the overloaded method
		 * called public void drive(String destination);*/
	}
}
