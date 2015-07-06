package com.OCP36;

public class BoxPrinterTest {
	public static void main(String[] args) {
		BoxPrinter value1 = new BoxPrinter(new Integer(10));
		System.out.println(value1);
		BoxPrinter value2 = new BoxPrinter("Hello World");
		System.out.println(value2);

		Integer intValue2 = (Integer) value2.getValue();
	}
}
