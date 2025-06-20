import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get input from the user
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // method calling to count vowels and consonants
        countVowelsAndConsonants(str);

        input.close();
    }

    public static void countVowelsAndConsonants(String str) {
        int vowelsCount = 0, consonantsCount = 0;

        str = str.toLowerCase(); // Convert to lowercase for uniformity

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (isVowel(ch)) {
                vowelsCount++;
            } else {
                consonantsCount++;
            }
        }

        // display the result
        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonants: " + consonantsCount);
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}