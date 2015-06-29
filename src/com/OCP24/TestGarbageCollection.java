package com.OCP24;

public class TestGarbageCollection {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		StringBuffer sb1 = new StringBuffer("GoodBye");
		
		System.out.println(sb);
		System.out.println(sb1);
		sb = sb1; // StringBuffer "Hello" is eligible for collection. 
		System.out.println(sb);
		System.out.println(sb1);
	}

}
