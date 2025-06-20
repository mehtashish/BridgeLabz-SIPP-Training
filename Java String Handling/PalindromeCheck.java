import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get string input from the user
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        // display the result based on condition if the given string is a palindrome
        if (isPalindrome(str)) {
            System.out.print("Yes! It's a palindrome.");
        } else {
            System.out.print("No! It's not a palindrome.");
        }

        input.close();
    }

    // method to return a boolean value if the given string is a palindrome
    private static boolean isPalindrome(String str) {
        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }

        if (reverseStr.equals(str)) {
            return true;
        } else {
            return false;
        }
    }
}