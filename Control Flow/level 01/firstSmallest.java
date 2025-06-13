import java.util.Scanner;

public class firstSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // to get the numbers from the user
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        
        // condition to check if the first number is the smallest
        if(number1 < number2) {
            if (number1 < number3) {
                System.out.println("Is the first number the smallest? Yes");
            }
        }
        else {
                System.out.println("Is the first number the smallest? No");
        }

        input.close();
    }
}
