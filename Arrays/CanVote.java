import java.util.Scanner;

public class CanVote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // to store the age of 10 students
        int[] age = new int[10];

        // read the age of students using for loop
        for (int i = 0; i < age.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            age[i] = input.nextInt();
        }

        // loop to check if the students is eligible to vote or not
        for (int i = 0; i < age.length; i++) {

            // conditon to check if the input age is a negative number
            if (age[i] < 0) {
                System.out.println("Invalid age!");
            }

            // condition to check if the age is greater or equal to 18
            else if (age[i] >= 18) {
                System.out.println("The student with the age " + age[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + age[i] + " cannot vote.");
            }
        }

        input.close();
    }
}