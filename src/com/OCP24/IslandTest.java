package com.OCP24;

public class IslandTest {
	IslandTest i = null;
	public static void main(String[]args){
		IslandTest i2 = new IslandTest();
		IslandTest i3 = new IslandTest();
		IslandTest i4 = new IslandTest();
		
		i2.i = i3;
		i3.i = i4;
		i4.i = i2;
		i2 = null;
		i3 = null;
		i4 = null;
	}
}
