import java.util.Scanner;

public class LowerCaseCompare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get the string input from the user
        System.out.print("Enter your text: ");
        String text = input.nextLine();

        // convert to lowercase using custom method
        String customLower = toLowerManual(text);

        // convert to lowercase using built-in method
        String builtInLower = text.toLowerCase();

        // compare both the lower case methods
        boolean areEqual = compareStrings(customLower, builtInLower);

        // display results
        System.out.println("\nManual lowercase conversion : " + customLower);
        System.out.println("Built-in toLowerCase() : " + builtInLower);
        System.out.println("\nAre both results equal? " + areEqual);

        input.close();
    }

    // method to convert string to lowercase using charAt() and ASCII logic
    public static String toLowerManual(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // condition to check if there are uppercase letters
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    // method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}