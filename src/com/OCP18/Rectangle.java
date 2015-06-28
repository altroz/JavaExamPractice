package com.OCP18;

public class Rectangle extends Shape implements Rotatable{
	private int length, height;
	public Rectangle(int l, int h){
		length = l;
		height = h;
	}
	public double area(){
		return length * height;
	}
	public void rotate(float degree){
		//Implement rotating functionality. 
	}
}
