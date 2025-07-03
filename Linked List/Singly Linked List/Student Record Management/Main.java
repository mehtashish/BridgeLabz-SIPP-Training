package singly;

public class Main {
	public static void main(String[] args) {
		StudentLinkedList student = new StudentLinkedList();
		student.addStudentAtStart(101, "Rohan", 23, 'C');
		student.addStudentAtStart(102, "Sandeep", 22, 'A');
		student.addStudentAtStart(103, "Nikhil", 21, 'B');
		student.addStudentAtStart(104, "Prashant", 20, 'D');

//		student.display();

//		student.deleteStudentRecord(104);

//		student.display();

//		student.updateStudentRecord(103);
		
		student.searchStudentRecord(102);
	}
}