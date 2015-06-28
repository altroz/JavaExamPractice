package com.OCP13;

public abstract class Shape {
	private Shape parentShape;
	final public void setParentShape(Shape shape){
		parentShape = shape;
	}
	public Shape getParentShape(){
		return parentShape;
	}
}
