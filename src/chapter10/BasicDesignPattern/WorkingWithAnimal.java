package chapter10.BasicDesignPattern;

public class WorkingWithAnimal {
	public static void main(String [] args){
		Dog fido = new Dog();
		fido.setName("Fido");
		System.out.println(fido.getName());
		fido.digHole();
		fido.setWeight(50);
	}
}
