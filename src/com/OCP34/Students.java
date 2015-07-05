package com.OCP34;

import java.util.*;

public class Students implements Comparable<Students> {
	String id;
	String name;
	Double cgpa;

	public Students(String studentID, String studentName, double studentCGPA) {
		id = studentID;
		name = studentName;
		cgpa = studentCGPA;
	}

	public String toString() {
		return "\n" + id + "\t" + name + "\t" + cgpa;
	}

	public int compareTo(Students that) {
		return this.id.compareTo(that.id);
	}

}
