package factoryDesignPattern;

public class ShapeFactory {
	public static Shape getShape(String sourceType){
		switch(sourceType){
		case "Circle":
			return new Circle(10,10,20);
		case "Rectangle":
			return new Rectangle(20,24);
		}
		return null;
	}
}
