public class Demo { 

    //instance variables

    int length,breath;

    //static variable
    static int a;
    static int b;

    //instance method
    public int area(int x,int y){

       //local variables x,y

        length=x;
        breath=y;
        return length*breath;
    }

    //static method
     static void method(){
         System.out.println(a+b);
    }

    public static  void main(String args[]){
 Demo ob = new Demo();
System.out.println( "area is " +ob.area(5,10));
         a=10;
        b=20;
        method();

    }
}
