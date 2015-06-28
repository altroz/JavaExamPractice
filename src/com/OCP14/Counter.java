package com.OCP14;

public class Counter {
	private static int counter;
	static {
	 counter = 1;
	}
	public Counter(){
		counter ++;
	}
	public static void printCount(){
		System.out.println("Number of instance: " + counter);
	}
	
	public static void main(String[]args){
		Counter anInstance = new Counter();
		Counter.printCount();
		Counter anInstance1 = new Counter();
		Counter.printCount();
	}
}
