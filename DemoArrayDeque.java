
import java.util.*;
public class DemoArrayDeque {
    public static void main(String args[]){
        ArrayDeque<String> deque=new ArrayDeque<String>();
        deque.add("feb");
        deque.add("mar");
        deque.add("apr");
        System.out.println(deque);
        deque.addFirst("jan");
        deque.addLast("may");
        System.out.println(deque);
        System.out.println(deque.size());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        deque.add("jan");
        System.out.println(deque);
    }
}
