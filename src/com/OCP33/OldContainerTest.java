package com.OCP33;

import java.util.Vector;

public class OldContainerTest {
	public static void main(String []args){
		Vector floatValues = new Vector();
		floatValues.add(10.0f);
		floatValues.add(100.0);
		
		for(int i = 0; i < floatValues.size(); i++){
			System.out.println(floatValues.get(i));
		}
	}
}
