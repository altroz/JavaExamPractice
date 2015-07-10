package objectComposition.book2;

public class Circle {
	private Point center;
	private int radius;
	
	public Circle(int x, int y, int r){
		center = new Point(x,y);
		radius = r;
	}
	
	public String toString(){
		return  "center = " + center + "  and radius = "+ radius;
	}
	
	public static void main(String[]args){
		System.out.println(new Circle(10,10,20));
	}
}
