import java.util.Scanner;

public class MatrixTo1D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get the number of rows from the user
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        // get the number if columns from the user
        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();

        // define 2D and 1D arrays
        int[][] matrix = new int[rows][columns];
        int[] array = new int[rows * columns];

        // get the elements of 2D array(matrix) from the user
        System.out.println("Enter elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // define index variable and initialize it to 0 to track the index of 1D array
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j]; // copying the elements of matrix to 1D array
            }
        }

        // display the elements of 1D array
        System.out.print("Elements of 1D array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        input.close();
    }
}