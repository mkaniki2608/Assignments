package basics;

public class ArraysMultiDimensional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3D array to store 5 Semesters data having 6 subjects and corresponding Status(Marks)
		
		String[][][] semesters = new String[5][2][6];
		
		//Semester-1 Subjects
		semesters[0][0][0] = "Mathematics I";
		semesters[0][0][1] = "Physics";
		semesters[0][0][2] = "Chemistry";
		semesters[0][0][3] = "Computer Programming";
		semesters[0][0][4] = "Engineering Drawing";
		semesters[0][0][5] = "Basic Electrical Eng.";
		
		//Semester-1 Status(Marks)
		semesters[0][1][0] = "Pass(78)";
		semesters[0][1][1] = "Pass(85)";
		semesters[0][1][2] = "Fail(21)";
		semesters[0][1][3] = "Pass(74)";
		semesters[0][1][4] = "Pass(88)";
		semesters[0][1][5] = "Pass(79)";
		
		//Semester-2 Subjects
		semesters[1][0][0] = "Mathematics II";
		semesters[1][0][1] = "Mechanics";
		semesters[1][0][2] = "Environmental Sci.";
		semesters[1][0][3] = "Basic Electronics";
		semesters[1][0][4] = "Engineering Physics";
		semesters[1][0][5] = "Engineering Graphics";
				
		//Semester-2 Status(Marks)
		semesters[1][1][0] = "Pass(82)";
		semesters[1][1][1] = "Pass(77)";
		semesters[1][1][2] = "Pass(93)";
		semesters[1][1][3] = "Fail(19)";
		semesters[1][1][4] = "Fail(24)";
		semesters[1][1][5] = "Pass(90)";
		
		//Semester-3 Subjects
		semesters[2][0][0] = "Data Structures";
		semesters[2][0][1] = "Discrete Mathematics";
		semesters[2][0][2] = "Digital Electronics";
		semesters[2][0][3] = "Operating Systems";
		semesters[2][0][4] = "Signals and Systems";
		semesters[2][0][5] = "Object-Oriented Prog.";
				
		//Semester-3 Status(Marks)
		semesters[2][1][0] = "Pass(88)";
		semesters[2][1][1] = "Pass(81)";
		semesters[2][1][2] = "Pass(76)";
		semesters[2][1][3] = "Fail(32)";
		semesters[2][1][4] = "Pass(85)";
		semesters[2][1][5] = "Pass(78)";
		
		//Semester-4 Subjects
		semesters[3][0][0] = "Algorithms";
		semesters[3][0][1] = "Computer Networks";
		semesters[3][0][2] = "Database Systems";
		semesters[3][0][3] = "Microprocessors";
		semesters[3][0][4] = "Communication Eng.";
		semesters[3][0][5] = "Software Engineering";
		
		//Semester-4 Status(Marks)
		semesters[3][1][0] = "Pass(91)";
		semesters[3][1][1] = "Pass(73)";
		semesters[3][1][2] = "Fail(19)";
		semesters[3][1][3] = "Pass(80)";
		semesters[3][1][4] = "Pass(76)";
		semesters[3][1][5] = "Pass(87)";
		
		//Semester-5 Subjects
		semesters[3][0][0] = "Probability & Stats";
		semesters[3][0][1] = "Machine Learning";
		semesters[3][0][2] = "Compiler Design";
		semesters[3][0][3] = "Theory of Computation";
		semesters[3][0][4] = "Embedded Systems";
		semesters[3][0][5] = "Computer Graphics";
		
		//Semester-5 Status(Marks)
		semesters[3][1][0] = "Pass(86)";
		semesters[3][1][1] = "Pass(88)";
		semesters[3][1][2] = "Pass(84)";
		semesters[3][1][3] = "Pass(95)";
		semesters[3][1][4] = "Pass(73)";
		semesters[3][1][5] = "Pass(90)";
		
		// Print Semester 2 Subject 4 and Subject 5 names
		// Semester 2 (index 1), Subject 4 & 5 (indexes 3 & 4)
		System.out.println("Subject-4 Name of Semester-2: " + semesters[1][0][3]);
		System.out.println("Subject-5 Name of Semester-2: " + semesters[1][0][4]);

		// Print the Status/Marks of Semester 4 Subject 3 and Subject 6
		// Semester 4 (index 3), Status of Subject 3 & 6 (indexes 2 & 5)
		System.out.println("Status(Marks) of Semester-4 Subject-3: " + semesters[3][1][2]);
		System.out.println("Status(Marks) of Semester-4 Subject-6: " + semesters[3][1][5]);
		
				

	}

}
