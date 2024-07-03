//Program to Demonstrate TreeMap and its Methods
import java.util.TreeMap;

public class TreeMapDemo{

	public static void main(String[] args) {
		//Creating an Oject for TreeMap
		TreeMap<Integer,Student> tmap= new TreeMap<Integer, Student>();
		//Adding elements
		tmap.put(3, new Student("Pranav",103));
		tmap.put(1, new Student("Rakshith",112));
		tmap.put(-4, new Student("Rani",121));
		tmap.put(-7, new Student("Mukesh",175));
		//Printing elements of TreeMap
		System.out.println(tmap);
		//Checkinh if the Key is Present or not
		System.out.println(tmap.containsKey(-4));
		//Checking for the value in TreeMap
		System.out.println(tmap.containsValue(103));
		//Printing the Size of TreeMap
		System.out.println(tmap.size());
		System.out.println(tmap.isEmpty());
		System.out.println(tmap.firstKey());
		System.out.println(tmap.lastKey());
		System.out.println(tmap.get(-7));
		tmap.pollFirstEntry();
		System.out.println(tmap);
		tmap.pollLastEntry();
		System.out.println(tmap);
		System.out.println(tmap.descendingKeySet());
		System.out.println(tmap.remove(1));
		System.out.println(tmap.values());
		tmap.put(35, new Student("Anil",142));
		tmap.put(22, new Student("bharat",160));
		tmap.put(45, new Student("Charan",132));
		//Printing TailMap Starting from the Key
		System.out.println(tmap.tailMap(35));
		tmap.clear();
		System.out.println(tmap);
		}

}
