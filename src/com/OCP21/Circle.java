package com.OCP21;

public class Circle {
	private Point center;
	public void setCircle(Point center){
		this.center = center;
		canvas.update(this);
		shapeArchiver.update(this);
	}
	
	public void setRadius(int radius){
		this.radius = radius;
		canvas.update(this);
		shapeArchiver.update(this);
	}
	
	private ShapeArchiver shapeArchiver;
	public void setShapeArchiver(ShapeArchiver shapeArchiver){
		this.shapeArchiver = shapeArchiver;
	}
	
	protected Canvas canvas;
	public void setCanvas(Canvas canvas){
		this.canvas = canvas;}
	
		private int radius;
		public Circle(int x, int y, int r){
			center = new Point(x,y);
			radius = r;
		}

	public String toString() {
		return "center = "+ center + " and radius = "+ radius;
	}
}
