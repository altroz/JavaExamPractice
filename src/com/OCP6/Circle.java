package com.OCP6;

public class Circle {

	private int xPos, yPos, radius;

	public Circle() {
		this(20, 20, 10);
	}

	public Circle(int x, int y) {
		this(x, y, 10);
	}

	public Circle(int x, int y, int r) {
		xPos = x;
		yPos = y;
		radius = r;
	}

	public String toString(){
		return "center = ("+ xPos + ", " + yPos + ") and radius = " + radius;
	}

	public static void main(String[] args) {
		System.out.println("The Circle 1"+ new Circle());
		System.out.println("The Circle 1"+ new Circle(20,20));
		System.out.println("The Circle 1"+ new Circle(20, 30, 50));
	}
}
