package singly;

import java.util.Scanner;

public class StudentLinkedList {
	Node head;

	public void addStudentAtStart(int rollNumber, String studentName, int studentAge, char studentGrade) {
		Node newNode = new Node(rollNumber, studentName, studentAge, studentGrade);
		newNode.next = head;
		head = newNode;
	}

	public void searchStudentRecord(int rollNumber) {
		if (head == null) {
			System.out.println("There is no student record with roll number " + rollNumber);
			return;
		}

		if (head.rollNumber == rollNumber) {
			System.out.println("Roll Number: " + head.rollNumber + ", " + "Student Name: " + head.studentName + ", "
					+ "Student Age: " + head.studentAge + ", " + "Student Grade: " + head.studentGrade);
			return;
		}

		Node current = head;
		while (current.next != null) {
			if (current.rollNumber == rollNumber) {
				System.out.println("Student record with roll number " + rollNumber + " :-\nRoll Number: "
						+ current.rollNumber + ", Student Name: " + current.studentName + ", Student Age: "
						+ current.studentAge + ", Student Grade: " + current.studentGrade);
			}
			current = current.next;
		}
	}

	public void deleteStudentRecord(int rollNumber) {
		if (head == null) {
			System.out.println("Student record with roll number " + rollNumber + " not found!");
			return;
		}

		if (head.rollNumber == rollNumber) {
			head = head.next;
			System.out.println("Student record with roll number " + rollNumber + " is deleted.");
			return;
		}

		Node current = head;
		while (current.next != null && current.next.rollNumber != rollNumber) {
			current = current.next;
		}

		if (current.next == null) {
			System.out.println("Student record with roll number " + rollNumber + " not found!");
			return;
		} else {
			current.next = current.next.next;
			System.out.println("Student record with roll number " + rollNumber + " is deleted.");
		}
	}

	public void updateStudentRecord(int rollNumber) {
		if (head == null) {
			System.out.println("There is no student record with roll number " + rollNumber + " to update!");
			return;
		}

		Node current = head;
		while (current != null) {
			if (current.rollNumber == rollNumber) {
				Scanner input = new Scanner(System.in);

				System.out.println("Enter new name: ");
				current.studentName = input.next();

				System.out.println("Enter new age: ");
				current.studentAge = input.nextInt();

				System.out.println("Enter new grade: ");
				current.studentGrade = input.next().charAt(0);

				System.out.println("Record updated successfully for roll number " + rollNumber);

				input.close();
				return;
			}
			current = current.next;
		}

		System.out.println("No student found with roll number " + rollNumber);
	}

	public void display() {
		Node current = head;
		while (current != null) {
			System.out.println("Roll Number: " + current.rollNumber + ", Student Name: " + current.studentName
					+ ", Student Age: " + current.studentAge + ", Student Grade: " + current.studentGrade);
			current = current.next;
		}
	}
}