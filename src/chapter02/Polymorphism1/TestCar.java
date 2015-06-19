package chapter02.Polymorphism1;

public class TestCar {
	public static void main(String[]args){
		Car a = new Car();
		Car b = new Porsche();
		
		a.drive();
		b.drive();
	}
}
