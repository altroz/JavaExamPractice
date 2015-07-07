package com.OCP42;
import java.util.*;
public class StudentTest {
	public static void main(String[]args){
		Student[] student = { new Student("CS016", "Lennon", 3.1), 
				new Student("CS014", "Dan", 3.1),new Student("CS013", "Eric", 3.1),
				new Student("CS012", "Marcos", 3.1),new Student("CS017", "Mario", 3.1),
				new Student("CS011", "Batista", 3.1),new Student("CS015", "Alex", 3.1)};
	
	System.out.println("Before sort by student ID");
	System.out.println("Student-ID\tName\tCGPA");
	System.out.println(Arrays.toString(student));
	
	Arrays.sort(student);
	System.out.println("After sort by student ID");
	System.out.println("Student-ID\tName\tCGPA");
	System.out.println(Arrays.toString(student));
	
	}
}
