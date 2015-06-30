package com.OCP29;

public class Circle {
	private int xPos, yPos, radius;
	public Circle(int x, int y, int r){
		xPos = x;
		yPos = y;
		radius = r;
	}
	
	public String toString(){
		return "center = ( "+ xPos + ", "+ yPos + ") and radius = "+ radius;
	}
}
