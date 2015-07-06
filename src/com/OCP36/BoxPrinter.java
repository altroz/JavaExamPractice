package com.OCP36;

public class BoxPrinter {
	private Object val;

	public BoxPrinter(Object args) {
		val = args;
	}

	public String toString() {
		return "[ " + val + " ]";
	}

	public Object getValue() {
		// TODO Auto-generated method stub
		return val;
	}
}
