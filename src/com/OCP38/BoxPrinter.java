package com.OCP38;

public class BoxPrinter<T> {
	private T value;

	public BoxPrinter(T arg) {
		value = arg;
	}

	public String toString() {
		return "[" + value + "]";
	}

	public T getValue() {
		return value;
	}

}
