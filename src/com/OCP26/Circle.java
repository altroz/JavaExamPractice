package com.OCP26;

public class Circle implements Shape{
	private int xPos, yPos;
	private int radius;
	
	public Circle(int x, int y, int r){
		xPos = x;
		yPos = y;
		radius = r;
		System.out.println("Circle Constructor");
	}
	public void draw(){
		System.out.println("Circle draw()");
		//draw() implementation
	}
	public void fillColor(){
		//fillColor() implementation
	}
}
