package com.OCP28;

public class PrinterFriendlyRectangle implements PrinterFriendlyShape{
	private int lenght, height;
	public PrinterFriendlyRectangle(int lenght, int height){
		this.lenght = lenght;
		this.height = height;
		System.out.println("PrinterFriendlyRectangle Constructor");
	}
	public void draw(){
		System.out.println("Friendly Printer Rectangle draw()");
	}
}
