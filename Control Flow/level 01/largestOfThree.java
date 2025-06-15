import java.util.Scanner;

public class largestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // to get three numbers from the user
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        // condition to check the largest of the three numbers
        // given as input from the user
        if (number1 > number2) {
            if (number1 > number3) {
                System.out.println("Is the first number the largest? Yes" +
                        "\nIs the second number the largest? No" +
                        "\nIs the third number the largest? No");
            } else {
                System.out.println("Is the first number the largest? No" +
                        "\nIs the second number the largest? No" +
                        "\nIs the third number the largest? Yes");
            }
        } else if (number2 > number3) {
            System.out.println("Is the first number the largest? No" +
                    "\nIs the second number the largest? Yes" +
                    "\nIs the third number the largest? No");
        } else {
            System.out.println("Is the first number the largest? No" +
                    "\nIs the second number the largest? No" +
                    "\nIs the third number the largest? Yes");
        }

        input.close();
    }
}