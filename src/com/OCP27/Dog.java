package com.OCP27;

public class Dog extends Animal{
	public void digHole(){
		System.out.println("Dig A hole");
		
	}
	public Dog(){
		super();
		setSound("Bark");
		flyingType = new CantFly();
	}
}
