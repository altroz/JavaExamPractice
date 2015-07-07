package com.OCP43;
import java.util.*;
public class Student implements Comparator<Student>{
	String id;
	String name;
	double cgpa;
	
	public Student(String studentId, String studentName, double studentCGPA){
		id = studentId;
		name = studentName;
		cgpa = studentCGPA;
	}
	
	public String toString(){
		return "\n" + id + "\t" + name + "\t"+ cgpa;
	}
	
	public int compare(Student s1, Student s2){
		return s1.compare(s1, s2);
	}
}
