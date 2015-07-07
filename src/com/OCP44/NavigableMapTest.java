package com.OCP44;
import java.util.*;
public class NavigableMapTest {
	public static void main(String[]args){
		NavigableMap<Integer, String> examScores = new TreeMap<Integer, String>();
		examScores.put(90,"Dan");
		examScores.put(60,"Sophia");
		examScores.put(10,"Ariel");
		examScores.put(55,"Krista");
		examScores.put(78,"David");
		
		System.out.println("The data in the map: "+ examScores);
		System.out.println("The data descending order is: "+ examScores.descendingMap());
		System.out.println("Details of those who passed the exam: "+ examScores.tailMap(40));
		System.out.println("The lowest mark is: "+ examScores.firstEntry());
	}
}
