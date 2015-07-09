package basicDesignPattern;

public class WorkingWithAnimal {
	public static void main(String[] args) {
		Dog fido = new Dog();
		fido.setName("Fido");
		System.out.println("The name of the Dog is: " + fido.getName());
		fido.digHole();
		fido.setWeight(50);
		System.out.println("The weight of the Dog is: " + fido.getWeight());
	}
}
