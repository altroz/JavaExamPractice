package com.OCP18;

public class EnumTest {
	PrinterType printerType;
	public EnumTest(PrinterType pType){
		printerType = pType;
	}
	public void features(){
		switch(printerType){
		case DOTMATRIX:
			System.out.println("Dot Matrix printeres are economicals and almost obsolete");
			break;
		case INKJET:
			System.out.println("InkJets printers are economicals and very useful");
			break;
		case LASER:
			System.out.println("Laser printers provides the best quality and are the fastest.");
			break;
		}
	}
	public static void main(String[]args){
		EnumTest enumTest =new EnumTest(PrinterType.LASER);
		enumTest.features();
	}
}
