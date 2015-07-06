package com.OCP37;

public class BoxPrinter<T> {
	private T value;

	public BoxPrinter(T arg) {
		value = arg;
	}

	public String toString() {
		return "[" + value + "]";
	}
}
