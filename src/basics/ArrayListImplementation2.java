package basics;

import java.util.ArrayList;
import java.util.List;

public class ArrayListImplementation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
		//Using ArrayList here as it follows insertion order and there are less/no modifications.
		/* Top 5 highest-grossing movies of all time
		1. Avatar(2009)
		2. Avengers: Endgame(2019)
		3. Avatar: The Way of Water(2022)
		4. Titanic(1997)
		5. Star Wars: The Force Awakens(2015) */ 
		
		
				//Creating Array list for Top 5 movie names using string data type
		
				List<String> top5MoviesArrayList = new ArrayList<String>();
				top5MoviesArrayList.add("Avatar(2009)");
				top5MoviesArrayList.add("Avengers: Endgame(2019)");
				top5MoviesArrayList.add("Avatar: The Way of Water(2022)");
				top5MoviesArrayList.add("Titanic(1997)");
				top5MoviesArrayList.add("Star Wars: The Force Awakens(2015)");
				
			
				
				System.out.println("Size of ArrayList is: " + top5MoviesArrayList.size());
		
				
				//Printing Top 5 highest grossing movies of all time using "for loop"
				
				System.out.println("Top 5 highest grossing movies of all time");
				
				for(int i = 0; i < top5MoviesArrayList.size(); i++)
				{
					System.out.println((i+1) + "." + top5MoviesArrayList.get(i));
				}
					
				//Printing 3rd movie on top 5 highest grossing movies list
				
				System.out.println("3rd movie on Top 5 highest grossing movies list is - " + top5MoviesArrayList.get(2));
				
			}

		


	}


