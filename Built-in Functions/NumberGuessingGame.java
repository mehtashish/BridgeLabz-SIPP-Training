import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("The computer will try to guess it.");
        System.out.println("Respond with: 'low', 'high', or 'correct'\n");

        int low = 1;
        int high = 100;
        boolean guessedCorrectly = false;

        while (!guessedCorrectly && low <= high) {
            int guess = generateGuess(low, high);
            System.out.println("Computer guess: " + guess);

            String feedback = getFeedback(input);

            switch (feedback) {
                case "low":
                    low = guess + 1;
                    break;
                case "high":
                    high = guess - 1;
                    break;
                case "correct":
                    System.out.println("Yay! Got you.");
                    guessedCorrectly = true;
                    break;
                default:
                    System.out.println("Invalid input. Enter 'low', 'high', or 'correct'.");
            }
        }

        input.close();
    }

    // Generates a guess between low and high
    public static int generateGuess(int low, int high) {
        return (low + high) / 2; // Binary search strategy
    }

    // Gets feedback from the user
    public static String getFeedback(Scanner input) {
        System.out.print("Enter feedback (low/high/correct): ");
        return input.next();
    }
}