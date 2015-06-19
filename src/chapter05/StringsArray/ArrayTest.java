package chapter05.StringsArray;

import chapter02.Inheritance.Ferrari;

public class ArrayTest {
	public static void main(String[]args){
	int[]values = new int[5];
	Ferrari[] ferrari = new Ferrari[5];
	
	/*Initializing a Multi-dimensional Array*/
	
	int [][] races = new int[3][];
	races[0] = new int [4];
	 races[1] = new int [3];
	 races[2] = new int [6];
	
	//Initializing Elements in Loop
	Ferrari[] myFerrari = new Ferrari[6];
	for(int x = 0; x<myFerrari.length; x++)
	{myFerrari [x] = new Ferrari();}
	
	}
}
