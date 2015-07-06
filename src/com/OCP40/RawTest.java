package com.OCP40;

import java.util.*;

public class RawTest {
	public static void main(String[]args){
		List list = new LinkedList();
		list.add("First");
		list.add("Second");
		list.add("Third");
		
		List<String>strList = list;
		for(Iterator<String>itemItr = strList.iterator();itemItr.hasNext();)
			System.out.println("Item: "+ itemItr.next());
	}
}
