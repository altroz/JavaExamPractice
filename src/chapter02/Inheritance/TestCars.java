package chapter02.Inheritance;

public class TestCars {
	public static void main(String [] args){
		Ferrari ferrari = new Ferrari();
		ferrari.goForADrive();
		ferrari.takeFerrariForADrive();
		
		Car ferrariObject = new Car();
		ferrariObject.goForADrive();
		((Ferrari) ferrariObject).takeFerrariForADrive();
	}
}
