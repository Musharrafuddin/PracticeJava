import java.util.HashSet;

public class DemoHashset {
    public static void main(String args[]){
        HashSet<Integer> hset=new HashSet<Integer>();
        hset.add(23);
        hset.add(23);
        hset.add(26);
        hset.add(88);
        hset.add(555);
        //hset.add(null);
        System.out.println(hset);
        System.out.println(hset.size());
        System.out.println(hset.contains(555));
        for (int x:hset){
            System.out.println(x);
        }

    }
}
