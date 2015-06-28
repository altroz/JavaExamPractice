package com.OCP12;

public abstract class Shape {
	public abstract double area();
	private Shape parentShape;
	public void setParentShape (Shape shape){
		parentShape = shape;
	}
	public Shape getParentShape () {
		return parentShape;
	}
}
