package AssertionnException.one;

public class Echo {
	public static void main(String[] args) {
		if (args.length == 0) {
			// no arguement - display an error to the user
			throw new IllegalArgumentException(
					"No input passed to echo command");
		} else {
			for (String str : args) {
				// command-line arguements are separated and passed as an array.
				// print them by adding a space between the array
				System.out.println(str + " ");
			}
		}
	}
}

