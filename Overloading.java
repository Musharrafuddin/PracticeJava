public class Overingloading {
    void area (int a ){
        System.out.println("area of Square : " +a*a);
    }
    void area(int a,int b){
        System.out.println("Area of rectangle : " +a*b);
    }
    void area(float r){
        float pi=3.14f;
        System.out.println("Area of Cricle : " +pi*r*r);
    }
    public static void main (String args[]){
        Overingloading ol =new Overingloading();
        ol.area(4);
        ol.area(3,4);
        ol.area(2.2f);
    }
}
