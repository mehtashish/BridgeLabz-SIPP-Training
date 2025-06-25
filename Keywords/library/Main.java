package library;

public class Main {
    public static void main(String[] args) {
    	LibraryManagementSystem book = new LibraryManagementSystem("Rich Dad Poor Dad", "Robert Kiyosaki", "546-5523-5626");

        // Static method call 
//    	LibraryManagementSystem.displayLibraryName();

        // Display book details
        book.displayBookDetails();
    }
}
