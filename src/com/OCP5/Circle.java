package com.OCP5;

public class Circle {
	private int xPos, yPos, radius;
	public Circle(){
		xPos = 20;
		yPos = 20;
		radius = 10;
	}
	public Circle(int x, int y){
		xPos = x;
		yPos = y;
		radius = 10;
	}
	public Circle(int x, int y, int r){
		xPos = x;
		yPos = y;
		radius = r;
	}
	public String toString(){
		return "center = (" + xPos + ", "+ yPos +  ") with radius = "+ radius;
	} 
	
	public static void main(String[]args){
		System.out.println("The Circle 1 : " + new Circle().toString());
		System.out.println("The Circle 2 : " + new Circle(4,5).toString());
		System.out.println("The Circle 3 : " + new Circle(30,20,30).toString());
	}
}
