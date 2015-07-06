package com.OCP42;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
	public static void main(String[]args){
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for(int i = 0; i<0;i++){
			nums.add(i);
		}
		System.out.println("Original list "+ nums);
		Iterator<Integer> numsIter = nums.iterator();
		while(numsIter.hasNext()){
			numsIter.next();
			
		}
		System.out.println("List after removing all elements "+ nums);
	}
}
