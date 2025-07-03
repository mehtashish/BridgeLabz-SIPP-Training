package employee;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();

		FullTimeEmployee emp1 = new FullTimeEmployee(1, "Alice", 50000, 10000);
		emp1.assignDepartment("Engineering");

		PartTimeEmployee emp2 = new PartTimeEmployee(2, "Bob", 10000, 40, 300);
		emp2.assignDepartment("Support");

		FullTimeEmployee emp3 = new FullTimeEmployee(3, "Charlie", 60000, 15000);
		emp3.assignDepartment("HR");

		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);

		for (Employee emp : employees) {
			emp.displayDetails();
		}
	}
}