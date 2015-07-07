package com.OCP45;
import java.util.*;
public class QueueTest {
	public static void main(String[]args){
		Queue<String> loginSequence = new LinkedList<String>();
		loginSequence.add("Harrison");
		loginSequence.add("Mark");
		loginSequence.add("Rebecca");
		loginSequence.add("Isabella");
		loginSequence.add("Emma");
		
		System.out.println("The login sequence is: "+ loginSequence);
		while(!loginSequence.isEmpty()){
			System.out.println("Removing: "+ loginSequence.remove());}
	}
}
