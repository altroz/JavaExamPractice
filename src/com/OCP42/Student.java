package com.OCP42;

public class Student implements Comparable <Student>{
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
	public int compareTo(Student that){
		return this.id.compareTo(that.id);
	}
}
