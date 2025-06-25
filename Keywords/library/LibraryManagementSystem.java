package library;

public class LibraryManagementSystem {
	private static String libraryName = "CS Departmental Library";
	private String title;
	private String author;

	// Final variable to ensure immutability
	private final String isbn;

	// Constructor using 'this'
	public LibraryManagementSystem(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}

	// Static method to display library name
	public static void displayLibraryName() {
		System.out.println("Library Name: " + libraryName);
	}

	public void displayBookDetails() {
		if (this instanceof LibraryManagementSystem) {
			System.out.println("Library Name: " + libraryName);
			System.out.println("Title of book: " + title);
			System.out.println("Author of the book: " + author);
			System.out.println("ISBN of the book: " + isbn);
		} else {
			System.out.println("Not a valid book object.");
		}
	}
}