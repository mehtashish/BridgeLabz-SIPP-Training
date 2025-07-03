package singly;

public class Node {
	int rollNumber;
	String studentName;
	int studentAge;
	char studentGrade;

	Node next;

	public Node(int rollNumber, String studentName, int studentAge, char studentGrade) {
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentGrade = studentGrade;
		this.next = null;
	}
}