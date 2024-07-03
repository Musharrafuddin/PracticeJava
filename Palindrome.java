
import java.util.Scanner;
public class Palindrome
{
    public static void main(String args[])
    {
        int num, m, rev = 0, x;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");

       // Get the number from the user

        num = s.nextInt();
        m = num;

	// Reverse the number

        while(num > 0)
        {
            x = num % 10;
            rev = rev * 10 + x;
            num /= 10;
        }

	// check if the given number is a palindrome

        if(rev == m)
        {
            System.out.println(" "+m+" is a palindrome number");
        }
        else
        {
            System.out.println(" "+m+" is not a palindrome number");
        }
    }
}