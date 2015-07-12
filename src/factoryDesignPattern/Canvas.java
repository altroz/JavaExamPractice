package factoryDesignPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Canvas {
	private ArrayList<Shape> shapeList = new ArrayList<Shape>();

	public void addNewShape(String sourceType) {
		Shape shape = ShapeFactory.getShape(sourceType);
		shapeList.add(shape);
	}

	public void redraw() {
		Iterator<Shape> itr = shapeList.iterator();
		while (itr.hasNext()) {
			Shape shape = itr.next();
			shape.draw();
		}
	}
}
