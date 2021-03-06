package com.OCP24;

import java.util.Date;

public class TestGCBehavior {
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total JVM Memory: " + rt.totalMemory());
		System.out.println("Before JVM Memory: " + rt.freeMemory());

		Date d = null;
		for (int i = 0; i < 100; i++) {
			d = new Date();
			d = null;
		}
		
	System.out.println("After Memory = "+ rt.freeMemory());
	rt.gc();
	System.out.println("After GC Memory = "+ rt.freeMemory());
	}
}
