package com.OCP15;

public class Shape {
	public static class Color{
		private int m_red, m_green, m_blue;
		public Color(){
			this(0,0,0);
		}
		public Color(int red, int green){
			this(red, green, 0);
		}
		public Color(int red, int green, int blue){
			m_red = red;
			m_green = green;
			m_blue = blue;
		}
		public String toString(){
			return "red = " + m_red + " green = "+ m_green + " blue = "+ m_blue;
		}
		//More instance variable and members for Shape class
	}
	public static void main(String[]args){
		Shape.Color white = new Shape.Color(25, 25);
		System.out.println("The code for white: "+ white);
	}
}
