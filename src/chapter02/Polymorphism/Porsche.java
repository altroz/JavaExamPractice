package chapter02.Polymorphism;

public class Porsche extends Car implements Convertible {
	public void takePorscheForADrive(){
		System.out.println("Driving A Porsche");
	}
	public void openHood(){
		System.out.println("Opening Hood... ");
	}
}
