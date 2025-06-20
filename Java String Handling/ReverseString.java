import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get string input from the user
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // display the reverse string returned from the method
        String reverseString = reverse(str);
        System.out.print("Reverse string: " + reverseString);

        input.close();
    }

    // method to reverse the string manually
    private static String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed; // returns the reversed string
    }
}