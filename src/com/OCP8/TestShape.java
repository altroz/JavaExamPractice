package com.OCP8;

public class TestShape {
	public static void main(String[]args){
		System.out.println("The area of the Circle is " + new Circle(10).area());
		System.out.println("The area of the Square is " + new Square(10).area());
		Shape s = new Square(50);
		Shape c = new Circle(35);
		System.out.println("The polymorphic type of shape is Square " + s.area());
		System.out.println("The polymorphic type of shape is Circle " + c.area());
		
	}
}
