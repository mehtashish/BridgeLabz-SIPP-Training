import java.util.Scanner;

public class sumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // to get the number from the user
        int number = input.nextInt();

        // to check if the input number is a natural number or not
        if (number > 0) {

            // formula to calculate the sum of n natural numbers
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);    
        }
        else {
            System.out.println("The number " + number + " is not a natural number");
        }

        input.close();
    }
}