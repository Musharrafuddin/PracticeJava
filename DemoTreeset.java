import java.util.TreeSet;

public class DemoTreeset {
public static void main(String args[]){

    TreeSet<String> nameset=new TreeSet<String>();
    nameset.add("Hyderabad");
    nameset.add("Bangaluru");
    nameset.add("Delhi");
    nameset.add("Mumbai");
    //nameset.add(null);
    System.out.println(nameset);
    System.out.println(nameset.descendingSet());
    System.out.println(nameset.last());
    System.out.println(nameset.first());
    
}
}