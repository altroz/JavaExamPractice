package basicDesignPattern;

public class Dog extends Animal {
	public void digHole() {
		System.out.println("Dug a Hole");
		// Further implementation of the method.
	}

	public Dog() {
		super();
		setSound("Bark");
	}
}
