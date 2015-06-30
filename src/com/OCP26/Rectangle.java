package com.OCP26;

public class Rectangle implements Shape {
	private int length, height;
	public Rectangle(int lenght, int height){
		this.length = length;
		this.height = height;
		System.out.println("Rectangle Constructor");
	}
	public void draw(){
		System.out.println("Rectangle draw()");
	}
	public void fillColor(){
		// fillColor() implementation
	}
}
