package com.OCP41;

import java.util.List;

public class WildCarUse {
	static void printList(List<?> list){
		for(Object l: list)
			System.out.println("["+ l + "]");
	}
}