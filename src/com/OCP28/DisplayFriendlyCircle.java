package com.OCP28;

public class DisplayFriendlyCircle implements DisplayFriendlyShape{
	private int xPos, yPos, radius;
	public DisplayFriendlyCircle(int x, int y, int r){
		xPos = x;
		yPos = y;
		radius = r;
	System.out.println("DisplayFriendlyCircle Constructor");}
	
	public void draw(){
		System.out.println("DisplayFriendlyCircle draw()");
	}
}
