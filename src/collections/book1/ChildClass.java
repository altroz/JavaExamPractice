package collections.book1;

public class ChildClass {
	int age;
	String name;
	ChildClass(String name, int age){
		this.age = age;
		this.name = name;
	}
	
	public String toString(){
		return ("I am a ChildClass, but you can call me "+ name+ ". My age is "+ age);
	}
}
