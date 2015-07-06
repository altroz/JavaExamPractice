package com.OCP42;
import java.util.*;

public class BoundedWildCard {
	public static Double sum(List<? extends Number>numList){
		Double result = 0.0;
		
		for(Number num: numList){
			result+= num.doubleValue();
		}
		return result;
	}
}
