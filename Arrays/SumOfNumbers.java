import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // define an array to store 10 numbers
        double[] numbers = new double[10];

        /*
         * define total variable to store the sum of input numbers and
         * initialized it to 0.0
         */
        double total = 0.0;

        // define index variable and initialized it to 0
        int index = 0;

        while (true) {
            // get the number from the user
            System.out.print("Enter number " + (index + 1) + ": ");
            double number = input.nextDouble();

            /*
             * condition to check if the input number is 0 or negative and also
             * if the index has value of 10 to break the loop
             */
            if (number <= 0 || index == 10) {
                break;
            }

            numbers[index] = number;
            index++;
        }

        // display the entered numbers
        System.out.print("Entered numbers: ");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }

        // display the sum of the entered numbers
        System.out.println("\nSum of numbers: " + total);

        input.close();
    }
}