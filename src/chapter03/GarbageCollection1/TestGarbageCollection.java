package chapter03.GarbageCollection1;

public class TestGarbageCollection {
	public static void main(String[] args){
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		sb=null;
	}
}
