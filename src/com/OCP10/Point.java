package com.OCP10;

public class Point {
	private int xPos, yPos;
	public Point(int x, int y){
		xPos = x;
		yPos = y;
	}
	public boolean equals(Point other){
		if(other == null)
			return false;
		else 
			return true;
	}
	public static void main(String[]args){
		Point p1 = new Point(20,20);
		Point p2 = new Point(50,40);
		Point p3 = new Point(50,40);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p2.equals(p3));
		System.out.println(p1.equals(p1));
	}
}
