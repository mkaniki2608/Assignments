package basics;

public class EmpGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employees emp = new Employees();
		
		//Creating Arrays to store Employee Names and IDs
		
		String[] names = {emp.emp1Name, emp.emp2Name, emp.emp3Name};
		int[] ids = {emp.emp1Id, emp.emp2Id, emp.emp3Id};
		
		// Print each employee's name and ID
        System.out.println("Employee1 Name: " + names[0] + ", Employee1 ID: " + ids[0]);
        System.out.println("Employee2 Name: " + names[1] + ", Employee2 ID: " + ids[1]);
        System.out.println("Employee3 Name: " + names[2] + ", Employee3 ID: " + ids[2]);
        
        
        }


	}


