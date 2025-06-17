import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get the natural number from the user
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // method calling
        sum(number);

        input.close();
    }

    // method declaration to calculate the sum of n natural numbers
    public static void sum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("The sum of natural numbers upto " + number + " is " + sum);
    }
}
