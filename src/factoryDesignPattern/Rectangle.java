package factoryDesignPattern;

public class Rectangle implements Shape {
	public Rectangle(int length, int height) {
		this.length = length;
		this.height = height;
	}

	private int length;
	private int height;

	public void draw() {
		System.out.println("Rectangle drawn");
	}

	public void fillColor() {
		System.out.println("Rectangle color filled");
	}
}
