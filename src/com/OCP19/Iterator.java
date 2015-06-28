package com.OCP19;

public interface Iterator<E> {
	boolean hasNext();
	E next();
	void remove();
}
