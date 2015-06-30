package com.OCP26;

import java.util.ArrayList;
import java.util.Iterator;

public class Canvas {
	private ArrayList <Shape> shapeList = new ArrayList<Shape>();
	public void addNewShape(String ShapeType){
		Shape shape = ShapeFactory.getShape(ShapeType);
		shapeList.add(shape);	}
	public void redraw(){
		Iterator<Shape> itr = shapeList.iterator();
		while(itr.hasNext()){
			Shape shape = itr.next();
			shape.draw();
		}
	}
}
