package com.OCP38;

public class BoxPrinterTest {
	public static void main(String[]args){
		BoxPrinter<Integer>value1 = new BoxPrinter<Integer>(new Integer(10));
		System.out.println(value1);
		Integer intValue1 = value1.getValue();
		System.out.println(intValue1);
		BoxPrinter<String>value2 = new BoxPrinter<String>("Hello World");
		String intValue2 = value2.getValue();
		System.out.println(intValue2);
		System.out.println(value2);
		}
}
