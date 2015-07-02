package com.OCP32;

public class ShapeFactory {
	public static Shape getShape(String sourceType){
		switch(sourceType){
		case "Circle":
			return new Circle(10,10,20);
		case "Rectangel":
			return new Rectangle(10,20);
		}
		return null;
	}
}
