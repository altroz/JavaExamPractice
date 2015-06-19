package chapter05.StringsArray;

public class StringTest1 {
	public static void main(String[] args){
		String a = "abc";
		// Creates one String object and one reference variable.
		
		String b = new String("cfg");
		/*Creates two string object and one reference variable. 
		 * 1. The new String object resides in memory. 
		 * 2. The literal "abc" is placed in the pool*/
		
		// Other methods for String
		a.charAt(2);
		a.concat(b);
		a.equals(b);
		a.length();
		a.replace("a","q");
		a.substring(1, 2);
		
		
		
	}
}		
