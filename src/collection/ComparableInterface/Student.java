package collection.ComparableInterface;

public class Student implements Comparable<Student> {
	String id;
	String name;
	double gpa;

	public Student(String studentId, String studentName, double studentGPA) {
		id = studentId;
		name = studentName;
		gpa = studentGPA;
	}

	public String toString() {
		return "\n" + id + "\t" + name + "\t" + gpa;
	}

	public int compareTo(Student that) {
		return this.id.compareTo(that.id);
	}

}
