package basics;

public class ArraysMultiDimensional1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3D array to store 5 Semesters data having 6 subjects and corresponding Status(Marks)
		
		String[][][] semester = {
	            {   // Semester 1 - Subjects & Corresponding Status(Marks)
	                {"Mathematics I", "Physics", "Chemistry", "Computer Programming", "Engineering Drawing", "Basic Electrical Eng."},
	                {"Pass(78)", "Pass(85)", "Fail(21)", "Pass(74)", "Pass(88)", "Pass(79)"}
	            },
	            {   // Semester 2 - Subjects & Corresponding Status(Marks)
	                {"Mathematics II", "Mechanics", "Environmental Sci.", "Basic Electronics", "Engineering Physics", "Engineering Graphics"},
	                {"Pass(82)", "Pass(77)", "Pass(93)", "Fail(19)", "Fail(24)", "Pass(90)"}
	            },
	            {   // Semester 3 - Subjects & Corresponding Status(Marks)
	                {"Data Structures", "Discrete Mathematics", "Digital Electronics", "Operating Systems", "Signals and Systems", "Object-Oriented Prog."},
	                {"Pass(88)", "Pass(81)", "Pass(76)", "Fail(32)", "Pass(85)", "Pass(78)"}
	            },
	            {   // Semester 4 - Subjects & Corresponding Status(Marks)
	                {"Algorithms", "Computer Networks", "Database Systems", "Microprocessors", "Communication Eng.", "Software Engineering"},
	                {"Pass(91)", "Pass(73)", "Fail(19)", "Pass(80)", "Pass(76)", "Pass(87)"}
	            },
	            {   // Semester 5 - Subjects & Corresponding Status(Marks)
	                {"Probability & Stats", "Machine Learning", "Compiler Design", "Theory of Computation", "Embedded Systems", "Computer Graphics"},
	                {"Pass(86)", "Pass(88)", "Pass(84)", "Pass(95)", "Pass(73)", "Pass(90)"}
	            }
	        };

	        // Print Semester 2 Subject 4 and Subject 5 names
			// Semester 2 (index 1), Subject 4 & 5 (indexes 3 & 4)
		    System.out.println("Subject-4 Name of Semester-2: " + semester[1][0][3]);
	        System.out.println("Subject-5 Name of Semester-2: " + semester[1][0][4]);

	        // Print the Status/Marks of Semester 4 Subject 3 and Subject 6
	        // Semester 4 (index 3), Status of Subject 3 & 6 (indexes 2 & 5)
	        System.out.println("Status(Marks) of Semester-4 Subject-3: " + semester[3][1][2]);
	        System.out.println("Status(Marks) of Semester-4 Subject-6: " + semester[3][1][5]);

	}

}
