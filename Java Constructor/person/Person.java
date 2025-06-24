package person;

public class Person {
	private String name;
	private int age;
	private String gender;

	// Parameterized constructor
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	// Copy constructor
	public Person(Person other) {
		this.name = other.name;
		this.age = other.age;
		this.gender = other.gender;
	}

	// Method to display details
	public void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
	}
}