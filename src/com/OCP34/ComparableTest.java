package com.OCP34;

import java.util.Arrays;

public class ComparableTest {
	public static void main(String[]args){
		Students[] students = {new Students("CS011", "Nazmul ",3.6),
				new Students("CS021", "Dennis",3.5),
				new Students("CS012", "Patricia",3.0),
				new Students("CS013", "Faisal",3.4),
				new Students("CS051", "Farhan",3.7)};
		
		System.out.println("Before sorting by student ID ");
		System.out.println("Student-ID"+"\t" + "Name"+ "\t" +"CGPA (4.0)");
		System.out.println(Arrays.toString(students));
		
		Arrays.sort(students);
		
		System.out.println("After sorting by student ID ");
		System.out.println("Student-ID + \t + Name+ \t + CGPA (4.0)");
		System.out.println(Arrays.toString(students));
		
	}
	
	
}
