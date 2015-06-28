package com.OCP3;

public class Circle {
	public void fillColor(int red, int green, int blue){ 
		// Actual Code
		System.out.println("Fill Color 1");
	}
	public void fillColor(float hue, float saturation, float brightness){ 
		// Actual Code
		System.out.println("Fill Color 2");
	}
	public static void main(String[]args){
		Circle c1 = new Circle();
		c1.fillColor(10,20,10);
		c1.fillColor(0, 255, 255);
	}
}

