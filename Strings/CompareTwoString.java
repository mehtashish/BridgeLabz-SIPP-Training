import java.util.Scanner;

public class CompareTwoString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get two strings input from the user
        System.out.print("Enter first string: ");
        String string1 = input.next();

        System.out.print("Enter second string: ");
        String string2 = input.next();

        // user-defined method to compare
        boolean customResult = compareUsingCharAt(string1, string2);

        // built-in equals method to compare
        boolean builtInResult = string1.equals(string2);

        // display the results
        System.out.println("\nCustom comparison result: " + customResult);
        System.out.println("Built-in equals() result: " + builtInResult);

        input.close();
    }

    // method to compare strings using charAt() function
    public static boolean compareUsingCharAt(String string1, String string2) {
        if (string1.length() != string2.length())
            return false;

        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) != string2.charAt(i))
                return false;
        }

        return true;
    }
}