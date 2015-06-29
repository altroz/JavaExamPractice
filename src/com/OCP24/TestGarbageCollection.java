package com.OCP24;

public class TestGarbageCollection {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		sb = null;
		System.out.println(sb);

	}

}
