package basics;

import java.util.ArrayList;
import java.util.List;

public class ArrayListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Problem Statement: Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined.
		//Using ArrayList here as it follows insertion order and there are less/no modifications.
		//5 largest cities in India based on size as per descending order are Delhi - 1484 Sq Km, Bangalore - 741 Sq Km, Hyderabad - 650 Sq Km, Visakhapatnam - 640 Sq Km and Lucknow - 631 Sq Km
		
		//Creating Array list for City names using string data type
		List<String> cityNamesArrayList = new ArrayList<String>();
		cityNamesArrayList.add("Delhi");
		cityNamesArrayList.add("Bengaluru");
		cityNamesArrayList.add("Hyderabad");
		cityNamesArrayList.add("Visakhapatnam");
		cityNamesArrayList.add("Lucknow");
		
		System.out.println(cityNamesArrayList.size());
/*		System.out.println(cityNamesArrayList.get(0));
		System.out.println(cityNamesArrayList.get(1));
		System.out.println(cityNamesArrayList.get(2));
		System.out.println(cityNamesArrayList.get(3));
		System.out.println(cityNamesArrayList.get(4));
		System.out.println(cityNamesArrayList);         */
		
		
		//Creating Array list for City Area Sizes in Sq Km using int data type
		List<Integer> cityAreaSizesList = new ArrayList<Integer>();
		cityAreaSizesList.add(1484);
		cityAreaSizesList.add(741);
		cityAreaSizesList.add(650);
		cityAreaSizesList.add(640);
		cityAreaSizesList.add(631);
		
		System.out.println(cityAreaSizesList.size());
/*		System.out.println(cityAreaSizesList.get(0));
		System.out.println(cityAreaSizesList.get(1));
		System.out.println(cityAreaSizesList.get(2));
		System.out.println(cityAreaSizesList.get(3));
		System.out.println(cityAreaSizesList.get(4));
		System.out.println(cityAreaSizesList);         */
		
		//Printing cityNamesArrayList and cityAreaSizesList in Sq Km using "for loop"
		
		System.out.println("City Names and City Area Sizes");
		
		for(int i = 0; i < cityNamesArrayList.size(); i++)
		{
			System.out.println((i+1) + "." + cityNamesArrayList.get(i) + "-" + cityAreaSizesList.get(i) + "Sq Km" );
		}
			
		//Printing total area of 3rd and 4th cities combined
		
		System.out.println("Printing total area of 3rd and 4th Cities combined");
		int totalArea = cityAreaSizesList.get(3) + cityAreaSizesList.get(4);
		System.out.println("Total Area of 3rd and 4th Cities combined: " + totalArea + "Sq Km");
		
		
		
	}

}
