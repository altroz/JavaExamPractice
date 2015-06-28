package com.OCP11;

public class Rectangle extends Shape {
	private int length, height;
	
	public Rectangle(int l, int h){
		l = length;
		h = height;
	}
	public double area(){
		return length * height;
	}
}
