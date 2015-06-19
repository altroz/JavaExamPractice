package chapter02.Polymorphism3;

public class Car2 extends Car{
	public void drive(){/* no Exception thrown*/};
	public static void main(){
		Car a = new Car2();
		Car2 b = new Car2();
		
		b.drive();
		//a.drive();
	}
}
