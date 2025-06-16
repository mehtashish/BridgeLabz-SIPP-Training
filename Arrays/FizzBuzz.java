import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get the number from the user
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number > 0) {
            String[] arr = new String[number];

            // fill the array with Fizz, Buzz, FizzBuzz or the number itself
            for (int i = 1; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    arr[i - 1] = "FizzBuzz";
                } else if (i % 3 == 0) {
                    arr[i - 1] = "Fizz";
                } else if (i % 5 == 0) {
                    arr[i - 1] = "Buzz";
                } else {
                    arr[i - 1] = String.valueOf(i);
                }
            }

            // display the results
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Position " + (i + 1) + " = " + arr[i]);
            }
        } else {
            System.out.println("Not a positive integer.");
        }

        input.close();
    }
}