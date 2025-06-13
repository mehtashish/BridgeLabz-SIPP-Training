import java.util.Scanner;

public class isDivisible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // to get the number from the user
        int number = input.nextInt();

        // condition to check if the number is divisible by 5
        if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5? Yes");
        }
        else {
            System.out.println("Is the number " + number + " divisible by 5? No");
        }

        input.close();
    }    
}
