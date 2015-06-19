package chapter05.StringBuffer;

public class StringTest {
	public static void main(String[] args){
	String a = new String();
	a = "abc";
	
	String b = new String("abc");
	String c = "abc";
	
	a = a.concat("efg");
	/*Due to String's immutability, the invocation left us with 
	 * three object string. 
	 * 
	 * 1. object contains ("abc");
	 * 2. object contains (concat("efg");)
	 * 2. object contains s.concat("efg");*/
	
	/* String object with predefined methods.   */
	a.toLowerCase();
	b.toString();
	c.toUpperCase();
	a.trim();
	
	
	}

}
