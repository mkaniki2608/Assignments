package basics;

public class ArrayAverageOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value
				
		int i[] = {12, 24, 36, 48, 84, 72, 11, 22, 33, 44};
		
		// Accessing & Printing 5th and 6th value
		
		int fifthNum = i[4];
		int sixthNum = i[5];
		
		System.out.println("5th value is: " + i[4]);
		System.out.println("6th value is: " + i[5]);
		
		// Average of 5th and 6th values
		
		double averageOf5th6thNums = (fifthNum / sixthNum) / 2.0;
		System.out.println("Average of 5th and 6th values: " + averageOf5th6thNums);
		
		
	}

}
