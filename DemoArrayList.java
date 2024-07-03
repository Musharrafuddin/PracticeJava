import java.util.*;
public class DemoArrayList {

    public static void main(String args[]){
        List list = new ArrayList();
        list.add(15);
        list.add(67.7);
        list.add('m');
        list.add("hello");
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.set(0,20));
        list.add(1,10);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
Iterator itr= list.iterator();
while (itr.hasNext())
    System.out.println(itr.next());
    }
}
