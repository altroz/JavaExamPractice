package com.OCP17;

public class StatusReporter {
	static Shape.Color getDescriptiveColor (final Shape.Color color){
		class DescriptiveColor extends Shape.Color{
			public String toString(){
				return "You have selected a color with KGB values "+ color;
			}
		}
		return new DescriptiveColor();
		}
	public static void main(String[]args){
		Shape.Color descriptiveColor = StatusReporter.getDescriptiveColor(new Shape.Color(20,40,50));
		System.out.println(descriptiveColor);
	}
}

