package com.OCP8;

public class Square extends Shape{
	private int side;
	public Square(int s) {
		side = s;
	}
	public double area(){
		return side* side;
	}
}
