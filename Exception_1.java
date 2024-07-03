public class Exception_1 {
    public static void main(String args[]){
        int a=10,b=0;
        try{
            int c= a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Division by Zero Causes Arithmetic Exception");
        }
    }
}
