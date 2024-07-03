import java.util.Scanner;
public class Condition {
    public static void main(String args[]) {
        int x, y, z;
        System.out.println("Enter three numbers : ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        if (x > y && x > z) {
            System.out.println("Greatest number is " + x);
        } else if (y > x && y > z) {
            System.out.println("Greatest number is " + y);
        }
        else {
            System.out.println("Greatest number is "+z);
        }
    }
    }
