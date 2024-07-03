//Program to Demonstrate Linked Hash Map and its Methods
import java.util.LinkedHashMap;

public class LinkedHashmapDemo {

	public static void main(String[] args) {
		//Creating an Object for Linkedhashmap 
		LinkedHashMap<Integer, String> lhmap = new LinkedHashMap();
		//Adding elements into Linked Hash Map
		lhmap.put(-3, "Minus Three");
		lhmap.put(-2, "Minus Two");
		lhmap.put(12, "Twelve");
		lhmap.put(1000, "One Thousand");
		lhmap.put(200, "Two Hundred");
		lhmap.put(99, "Ninty Nine");
		lhmap.put(534, "Five Hundred Four");
		//Printing the elements and Keys
		System.out.println(lhmap);
		//Getting values Mapped to Keys
		System.out.println(lhmap.get(-3));
		System.out.println(lhmap.get(12));
		System.out.println(lhmap.get(1000));
		System.out.println(lhmap.get(99));
		//Checking if Linked Hash map is Empty or Not
		System.out.println(lhmap.isEmpty());
		//Inserting Element if the Key is Absent
		lhmap.putIfAbsent(11, "Eleven");
		System.out.println(lhmap);
		//removing an Element from LinkedHashMap 
		lhmap.remove(200);
		System.out.println(lhmap);
		//Replacing the Present Key values
		lhmap.replace(99, "Ninty Nine", "NInty Nine");
		//Printing the Size of LinkedHashMap
		System.out.println(lhmap.size());
		//Printing the values of the LinkedhashMap
		System.out.println(lhmap.values());
		//Clearing out the Elements
		lhmap.clear();
		System.out.println(lhmap);
	}

}
