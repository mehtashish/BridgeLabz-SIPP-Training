import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get the number from the user
        int number = input.nextInt();

        // to store the results of multiplication in the array
        int[] arr = new int[10];

        // displays the multiplication table for the input number
        for (int i = 1; i <= arr.length; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        input.close();
    }
}