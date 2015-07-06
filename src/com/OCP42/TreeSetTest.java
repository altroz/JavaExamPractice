package com.OCP42;
import java.util.*;
public class TreeSetTest {
	public static void main(String[]args){
		String pangram = "the quick brown fox jumps over the lazy dog";
		Set<Character>atoZ = new TreeSet<Character>();
		for(char gram: pangram.toCharArray())
			atoZ.add(gram);
		
		System.out.println("The program is : "+ pangram);
		System.out.println("The sorted character: "+ atoZ);
	}
}
