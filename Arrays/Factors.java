import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get the number from the user
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        // maxFactor and index variable to reflect the index of the array
        int maxFactor = 10;
        int index = 0;

        // initialize factors array to store factors of the number
        int[] factors = new int[maxFactor];

        // find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    int[] tempFactors = new int[2 * maxFactor];
                    for (int j = 0; j < factors.length; j++) {
                        tempFactors[i] = factors[j];
                    }
                    factors = tempFactors; // reassign resized array
                }
                factors[index++] = i; // store factors
            }
        }

        // to display factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        input.close();
    }
}