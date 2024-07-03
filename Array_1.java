import java.util.Scanner;
public class Array_1 {
        public static void main (String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number of Elements :  ");
            int n= sc.nextInt();
            int []arr = new int[n];
            int i;
            for(i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            for(int j:arr){
                System.out.println(j);
            }
System.out.println("number of elements are :"+n);
        }
    }