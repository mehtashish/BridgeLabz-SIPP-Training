import java.util.Scanner;

public class StringException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // get the string input from the user
        System.out.print("Enter a string: ");
        String str = sc.next();

        // method calling that generates the exception
        System.out.println("\nRunning method that throws the exception:");
        try {
            generateException(str);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("\nException caught in main: " + e);
        }

        // method calling that handles the exception using try-catch
        System.out.println("\nRunning method that handles the exception:");
        handleException(str);

        sc.close();
    }

    // method that generates StringIndexOutOfBoundsException
    public static void generateException(String str) {
        // deliberately access index one beyond the limit
        for (int i = 0; i <= str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    // method that handles the exception using try-catch
    public static void handleException(String str) {
        try {
            for (int i = 0; i <= str.length(); i++) {
                System.out.print(str.charAt(i) + " ");
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("\nHandled Exception: " + e);
        } catch (RuntimeException e) {
            System.out.println("\nGeneric Runtime Exception: " + e);
        }
    }
}