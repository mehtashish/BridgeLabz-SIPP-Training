package person;

public class Main {
	public static void main(String[] args) {
		Person original = new Person("Ashish", 22, "Male");
		Person copy = new Person(original);

		System.out.println("Original Person -");
		original.displayDetails();

		System.out.println("Copied Person -");
		copy.displayDetails();
	}
}