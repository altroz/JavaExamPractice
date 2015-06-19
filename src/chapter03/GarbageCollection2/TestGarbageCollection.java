package chapter03.GarbageCollection2;

public class TestGarbageCollection {
	public static void main(String[] args){
		StringBuffer s1 = new StringBuffer("Hello");
		StringBuffer s2 = new StringBuffer("GoodBye");
		
		System.out.println(s1);
		s1 = s2;
	}
}
