package employee_details;

public class Main {
	public static void main(String[] args) {
		Employee employee1 = new Employee(1, "Ashish", 50000);
		Employee employee2 = new Employee(2, "Prashant", 55000);
		
		System.out.println("--- Employee Details ---");
		employee1.displayDetails();
		System.out.println();
		employee2.displayDetails();
	}
}