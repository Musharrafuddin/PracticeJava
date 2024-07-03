import java.util.LinkedHashSet;

public class DemoLinkedHashset {
    public static void main(String args[]){
        LinkedHashSet<String> linkhash=new LinkedHashSet<String>();
        linkhash.add("bangaluru");
        linkhash.add("hyderabad");
        linkhash.add("delhi");
        System.out.println(linkhash);
        for (String x:linkhash){
            System.out.println(x);
        }
    }
}
