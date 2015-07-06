package com.OCP35;

import java.util.*;

public class OldContainerTest {
	public static void main(String[] args) {
		Vector floatValues = new Vector();
		floatValues.add(10.0f);
		floatValues.add(100.0);

		// for (int i = 0; i < floatValues.size(); i++) {
		// System.out.println(floatValues.get(i));
		// }

		for (int i = 0; i < floatValues.size(); i++) {
			float temp = (float) floatValues.get(i);
			System.out.println(temp);
		}

	}
}
