package areaOfCircle;

public class Circle {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	private double calculateArea(double radius) {
		return Math.PI * radius * radius;
	}
	
	private double calculateCircumference(double radius) {
		return 2 * Math.PI * radius;
	}

	public void displayResult() {
		System.out.println("Area of circle for radius " + radius + " is " + calculateArea(radius));
		System.out.println("Circumference of circle for radius " + radius + " is " + calculateCircumference(radius));
	}
}