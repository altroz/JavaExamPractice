package com.OCP28;

public class PrinterFriendlyCircle implements PrinterFriendlyShape {
	private int xPos, yPos;
	private int radius;
	
	public PrinterFriendlyCircle(int x, int y, int r){
		xPos = x;
		yPos = y;
		radius = r;
		System.out.println("PrinterFriendly Constructor");
	}
	
	public void draw(){
		System.out.println("Printer Friendly Circle draw()");
	}
}
