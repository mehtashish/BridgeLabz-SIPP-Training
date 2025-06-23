package employee_details;

public class Employee {
	private int id;
	private String name;
	private int salary;

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void displayDetails() {
		System.out.println("Employee id: " + id);
		System.out.println("Employee name: " + name);
		System.out.println("Employee salary: " + salary);
	}
}