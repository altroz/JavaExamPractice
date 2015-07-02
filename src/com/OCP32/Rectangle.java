package com.OCP32;

public class Rectangle implements Shape{
	private int width;
	private int height;
	
	public Rectangle(int w, int h){
		width = w;
		height = h;
	}

	@Override
	public void draw() {
		System.out.println("Rectangle Shape has been drawn.");
		
	}

	@Override
	public void fillColor() {
		// fillColor() method implementation blank.
		
	}
}
