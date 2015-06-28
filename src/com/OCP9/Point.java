package com.OCP9;

public class Point {
	private int xPos, yPos;
	public Point(int x, int y){
		xPos = x;
		yPos = y;
	}
	public String toString(){
		return "x = " + xPos + ", y = " + yPos;
	}
	
	public static void main(String[]args){
		Object obj = new Point (10,20);
		System.out.println("The point is " + obj);
	}
}
