import java.util.Scanner;

public class Characters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//getinput from the user
		System.out.print("Enter a string: ");
		String str = input.next();

		// get char arrays
		char[] userDefinedArray = withoutUsingBuiltIn(str);
		char[] builtInArray = str.toCharArray();

		// compare the two arrays
		boolean areEqual = compareCharArrays(userDefinedArray, builtInArray);

		// fisos=llarint both arrays
		System.out.println("\nUser-defined char array:");
		for (char c : userDefinedArray) {
			System.out.print(c + " ");
		}

		System.out.println("\n\nBuilt-in toCharArray() result:");
		for (char c : builtInArray) {
			System.out.print(c + " ");
		}

		// Display comparison result
		System.out.println("\n\nAre both arrays equal? " + areEqual);

		input.close();
	}

	// Method to convert string to char array manually
	private static char[] withoutUsingBuiltIn(String str) {
		char[] result = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			result[i] = str.charAt(i);
		}
		return result;
	}

	// Method to compare two char arrays
	private static boolean compareCharArrays(char[] a, char[] b) {
		if (a.length != b.length)
			return false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i])
				return false;
		}
		return true;
	}
}