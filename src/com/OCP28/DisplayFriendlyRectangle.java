package com.OCP28;

public class DisplayFriendlyRectangle implements DisplayFriendlyShape{
	private int lenght, height;
	public DisplayFriendlyRectangle(int lenght, int height){
		this.lenght = lenght;
		this.height = height;
		System.out.println("Display Friendly Rectangle Constructor");
	}
	
	public void draw(){
		System.out.println("Display Friendly Rectangle draw()");
	}
}
