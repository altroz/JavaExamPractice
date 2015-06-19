package chapter02.Inheritance1;

public class TestCars {
	public static void main(String[] args){
		Ferrari ferrari =new Ferrari();
		Porsche porsche = new Porsche();
		
		goForADrive(ferrari);
		goForADrive(porsche);
	}
	

	public static void goForADrive (Car car){
		car.goForADrive();
	}
}
