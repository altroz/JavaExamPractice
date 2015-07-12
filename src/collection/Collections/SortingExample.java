package collection.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortingExample {
	public static void main(String[] args) {
		ArrayList<String> stuff = new ArrayList();
		stuff.add("Ferrari");
		stuff.add("BMW");
		stuff.add("Porsche");
		stuff.add("Aston Martin");
		stuff.add("Lamborghini");
		stuff.add("Alfa Romeo");

		System.out.println("unsorted stuff " + stuff);
		Collections.sort(stuff);
		System.out.println("sorted " + stuff);
	}
}
