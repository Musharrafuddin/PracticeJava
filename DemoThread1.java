class ExThread1 implements Runnable {
     String name;
     public ExThread1(String name){
         super();
         this.name=name;
     }
     @Override
     public void run(){
         System.out.println("priority"+Thread.currentThread().getPriority());
         System.out.println("Name"+Thread.currentThread().getName());

     }
}
public class DemoThread1 {
     public static void main(String args[]){
         ExThread1 ext=new ExThread1("Child Thread");
         Thread t1=new Thread(ext);
         t1.start();
     }
}