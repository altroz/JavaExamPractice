package com.OCP18;

public class Circle {
	private int xPos, yPos, radius;
	public Circle(int x, int y, int r){
		xPos = x;
		yPos = y;
		radius = r;
	}
	public double area(){
		return Math.PI * radius * radius;
	}
	
	public void roll(float degree){
		//Implement rolling functionality
	}
	public static void main(String[]args){
		Circle circle = new Circle(10,10,20);
		circle.roll(45);
	}
}
