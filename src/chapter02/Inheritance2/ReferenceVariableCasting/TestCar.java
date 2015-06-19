package chapter02.Inheritance2.ReferenceVariableCasting;

public class TestCar {
	public static void main(String[] args){
		Car a[] = {new Car(), new Ferrari(), new Car()};
		
		for(Car Car : a){
			Car.drive();
			
			if(Car instanceof Ferrari){
				
				/* Car.brake() is going to lead to a compile time error
				 * The reason is because it requires a downcasting. */
				/*Ferrari d = (Ferrari)Car;
				 * d.brake();*/
				// The following code is a one-liner code. 
				((Ferrari) Car).brake();
			}
		}
	}
}
