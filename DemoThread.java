class ExThread extends Thread {
    String name;
    public ExThread(String name){
        super();
        this.name=name;
    }
public void run(){
        System.out.println(this.getName());
        System.out.println(this.getId()+ " " +this.getPriority());
}

}
public class DemoThread{
    public static void main(String args[]){
        ExThread ext = new ExThread("Demo Thread");
        ext.start();
    }
}