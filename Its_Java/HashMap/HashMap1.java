import java.util.HashMap;
public class HashMap1{
	public static void main(String[] args){
		HashMap<String, Integer> myMap = new HashMap<>();
		myMap.put("Shubham", 34);
		myMap.put("Raghav",90);
		myMap.put("Java ocdes", 56);
		System.out.println(myMap);
		
		// Fetching value by key:-
		System.out.println(myMap.get("Shubham"));
		
		
		//myMap.get("Shubham") = myMap.get("Shubham") + 1;
		//System.out.println(myMap.get("Shubham")); 
		
		// Checking key is present or not:-
		System.out.println(myMap.containsKey("Raghav"));			
		System.out.println(myMap.containsKey("Sujoy"));

		
		// Checking value is present or not in a mpa:-
		System.out.println(myMap.containsValue(56));
		System.out.println(myMap.containsValue(16));
		
		myMap.put("Shubham", myMap.get("Shubham") + 1);
		System.out.println(myMap);
	}
}