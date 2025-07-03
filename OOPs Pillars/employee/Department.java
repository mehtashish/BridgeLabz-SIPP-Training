package employee;

public interface Department {
	void assignDepartment(String department);

	String getDepartmentDetails();
}

abstract class Employee implements Department {
	private int employeeId;
	private String name;
	private double baseSalary;
	private String department;

	public Employee(int employeeId, String name, double baseSalary) {
		this.employeeId = employeeId;
		this.name = name;
		this.baseSalary = baseSalary;
	}

	// Getters and setters (encapsulation)
	public int getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	// Department interface methods
	@Override
	public void assignDepartment(String department) {
		this.department = department;
	}

	@Override
	public String getDepartmentDetails() {
		return "Department: " + department;
	}

	// Abstract method
	public abstract double calculateSalary();

	// Concrete method
	public void displayDetails() {
		System.out.println("ID: " + employeeId);
		System.out.println("Name: " + name);
		System.out.println("Base Salary: " + baseSalary);
		System.out.println(getDepartmentDetails());
		System.out.println("Total Salary: " + calculateSalary());
		System.out.println("-------------------------------");
	}
}

class FullTimeEmployee extends Employee {
	private double bonus;

	public FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus) {
		super(employeeId, name, baseSalary);
		this.bonus = bonus;
	}

	@Override
	public double calculateSalary() {
		return getBaseSalary() + bonus;
	}
}

class PartTimeEmployee extends Employee {
	private int hoursWorked;
	private double hourlyRate;

	public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate) {
		super(employeeId, name, baseSalary);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}

	@Override
	public double calculateSalary() {
		return getBaseSalary() + (hoursWorked * hourlyRate);
	}
}