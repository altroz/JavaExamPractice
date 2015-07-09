package basicDesignPattern;

public class WorkingWithAnimal {
	public static void main(String[] args) {
		Dog fido = new Dog();
		fido.setName("Fido");
		System.out.println("The name of the Dog is: " + fido.getName());
		fido.digHole();
		fido.setWeight(50);
		System.out.println("The weight of the Dog is: " + fido.getWeight());

		Animal doggy = new Dog();
		Animal kitty = new Cat();

		System.out.println("Dog says: " + doggy.getSound());
		System.out.println("Cat says: " + kitty.getSound());

		((Dog) doggy).digHole();

		Animal[] animal = new Animal[2];
		animal[0] = doggy;
		animal[1] = kitty;
		for (int i = 0; i < animal.length; i++) {
			System.out.println(animal[i].getSound());
		}
	}
}
