import java.util.Scanner;

public class MultiplicationTable6to9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get the number between 6 and 9 from the user
        System.out.print("Enter a number to find its multiplication table from 6 to 9: ");
        int number = input.nextInt();

        // define an integer array to store the multiplication result
        int[] multiplicationResult = new int[4];

        // calculate the multiplication table for the input number from 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        // display the result
        System.out.println("Multiplication Table of " + number + " from 6 to 9:");
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }

        input.close();
    }
}