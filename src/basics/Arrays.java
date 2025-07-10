package basics;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating 2 Arrays to store student names and marks
		
		String stuNames[] = {"Suresh", "Mahesh", "Naresh"};
		int stuMarks[] = {75, 80, 82};
		int[] updatedMarks = new int[3];
		
		//Adding 10 marks to each student using assignment operator
		updatedMarks[0] = stuMarks[0] + 10;
		updatedMarks[1] = stuMarks[1] + 10;
		updatedMarks[2] = stuMarks[2] + 10;
		
		//Printing student names and student marks
		System.out.println("Student names and Actual Marks: ");
		System.out.println(stuNames[0] + ":" + stuMarks[0]);
		System.out.println(stuNames[1] + ":" + stuMarks[1]);
		System.out.println(stuNames[2] + ":" + stuMarks[2]);
		
		//Printing student names and updated marks
		System.out.println("\nStudent names and Updated Marks: ");
		System.out.println(stuNames[0] + ":" + updatedMarks[0]);
		System.out.println(stuNames[1] + ":" + updatedMarks[1]);
		System.out.println(stuNames[2] + ":" + updatedMarks[2]);
		
		//Total marks after updating
		int totalMarks = updatedMarks[0] + updatedMarks[1] + updatedMarks[2];
		double average = totalMarks / 3.0;
		
		//Printing Average of all marks
		System.out.println("\nAverage marks of all students after update: " + average);
	
	}

}
