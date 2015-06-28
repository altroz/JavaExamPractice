package com.OCP18;

public enum PrinterType {
	
	private int pagePrinterCapacity;
	DOTMATRIX(5), INKJET(10), LASER(50);
	
	private PrinterType(int pagePrintCapacity){
		this.pagePrinterCapacity = pagePrintCapacity;
	}
	public int getPrinterPageCapacity(){
		return pagePrinterCapacity;
	}
}
