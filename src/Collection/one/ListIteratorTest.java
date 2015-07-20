package Collection.one;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
	public static void main(String[] args) {
		String palStr = "asadsa";
		List<Character> palindromeList = new LinkedList<Character>();

		for (char ch : palStr.toCharArray()) {
			palindromeList.add(ch);
		}
		System.out.println("Input String is: " + palStr);
		ListIterator<Character> iterator = palindromeList.listIterator();
		ListIterator<Character> revIterator = palindromeList.listIterator(palindromeList.size());
			

		boolean result = true;
		while (revIterator.hasPrevious() && iterator.hasNext()) {
			if (iterator.next() != revIterator.previous()) {
				result = false;
				break;
			}
		}
		if (result)
			System.out.println("Input string is a palindrome");
		else
			System.out.println("Input string is not palindrome");
	}
}
