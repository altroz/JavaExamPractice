package com.OCP17;

public abstract class Shape {
	public static class Color{
		int m_red, m_green, m_blue;
		public Color(){
			this(0,0,0);
		}
		public Color(int r){
			this(r,0,0);
		}
		public Color(int r, int g){
			this(r,g,0);
		}
		public Color(int r, int g, int b){
			m_red = r;
			m_green = g;
			m_blue = b;
		}
		public String toString(){
			return "red = "+ m_red + " green = "+ m_green + " blue = "+ m_blue;
		}
	}
}
