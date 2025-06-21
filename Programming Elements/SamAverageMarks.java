public class SamAverageMarks {
    public static void main(String[] args) {
        // Storing marks for each subject in respective variables
        int mathsMarks = 94;
        int physicsMarks = 95;
        int chemistryMarks = 96;

        // Calculating and displaying average marks scored by Sam
        double averageMarks = (double) (mathsMarks + physicsMarks + chemistryMarks) / 3;
        System.out.println("Sam's average marks in PCM is " + averageMarks);
    }
}