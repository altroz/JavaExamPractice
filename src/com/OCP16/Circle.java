package com.OCP16;

public class Circle {
	private int radius;
	Point center;
	class Point {
		private int xPos, yPos;
		public Point(int x, int y){
			xPos = x ; yPos = y;
		}
		
		public String toString(){
		return "( "+ xPos + ", " + yPos + " )";}
	}
	
	public Circle(int x, int y, int r){
		center = this.new Point(x,y);
		radius = r;
	}
	public String toString(){
		return "midpoint =  "+ center + " and radius = "+ radius;
	}
	public static void main(String[]args){
		System.out.println(new Circle(10,20,30));
	}
}
