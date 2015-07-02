package com.OCP32;

public class Circle implements Shape{
	private int xPos, yPos, radius;
	
	public Circle(int x, int y, int r){
		xPos = x;
		yPos = y;
		radius = r;
		System.out.println("Circle Constructor");
	}
	
	public void draw(){
		System.out.println("Circle: draw()");
	}
	
	public void fillColor(){
		//fillColor() implementation
	}
}
