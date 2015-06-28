package com.OCP2;

public class Circle {
	private int xPos, yPos, radius;
	public Circle(){
		xPos = 20; yPos= 20; radius=10;
	}
	public String toString(){
		return "center ( " + xPos + ", "+ yPos+ ") and radius = "  + radius;
	}
	
	public static void main(String[]args){
		System.out.println(new Circle());
	}

}
