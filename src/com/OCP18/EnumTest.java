package com.OCP18;

public class EnumTest {
	PrinterType printerType;
	public EnumTest(PrinterType pType){
		printerType = pType;
	}
	public void features(){
		switch(printerType){
		case DOTMATRIX:
			System.out.println(printerType.getPrinterPageCapacity());
			break;
		case INKJET:
			System.out.println(printerType.getPrinterPageCapacity());
			break;
		case LASER:
			System.out.println(printerType.getPrinterPageCapacity());
			break;
		}
	}
	public static void main(String[]args){
		EnumTest enumTest =new EnumTest(PrinterType.LASER);
		enumTest.features();
	}
}
