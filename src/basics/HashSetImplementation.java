package basics;

import java.util.HashSet;
import java.util.Set;

public class HashSetImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Problem Statement: Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.
		//Using Hashset as it follows insertion order and doesn't allow duplicates
		/*	Top 10 most visited tourist attractions in the world are: 
		1. Manhattan
		2. Eiffel Tower
		3. Mount Fuji
		4. Everest Base Camp
		5. Great Wall of China
		6. Sydney Opera House
		7. Machu Picchu
		8. Sagrada Familia
		9. Lumbini
		10.Colosseum */
		
		Set<String> Top10TouristAttractionsHashSet = new HashSet<String>();
		Top10TouristAttractionsHashSet.add("Manhattan");
		Top10TouristAttractionsHashSet.add("Eiffel Tower");
		Top10TouristAttractionsHashSet.add("Mount Fuji");
		Top10TouristAttractionsHashSet.add("Everest Base Camp");
		Top10TouristAttractionsHashSet.add("Great Wall of China");
		Top10TouristAttractionsHashSet.add("Sydney Opera House");
		Top10TouristAttractionsHashSet.add("Machu Picchu");
		Top10TouristAttractionsHashSet.add("Sagrada Familia");
		Top10TouristAttractionsHashSet.add("Lumbini");
		Top10TouristAttractionsHashSet.add("Colosseum");
		
		System.out.println("List of Top 10 Tourist Attrations in the world are: " + Top10TouristAttractionsHashSet);
		System.out.println("Size of Top10TouristAttractionsHashSet is " + Top10TouristAttractionsHashSet.size());
		
		
		
		
		
		
		
		

	}

}
