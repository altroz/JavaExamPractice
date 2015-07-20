package Collection.one;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[]args){
		String pangram = "the quick brown fox jumps over the lazy dog";
		Set<Character>aToZ = new TreeSet<Character>();
		
		for(char gram: pangram.toCharArray())
			aToZ.add(gram);
		
		System.out.println("The program is: "+ pangram );
		System.out.println("The Sorted character: "+ aToZ);
	}
}
