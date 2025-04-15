import java.util.*;
import java.util.Scanner;
public class paliandrome {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner s = new Scanner(System.in);
        int num ; 
        System.out.println("Enter The number to check for the paliandrome");
        num = s.nextInt();
        int temp = num;
        double rev = 0;
        double d ;
        while(num > 0)
        {
            d = num%10;
            rev = rev*10 + d;
            num = num/10;
        }
        System.out.println(rev);

        if (rev == temp)
        {
            System.out.println("Paliandrome ");
        }
        else
        {
            System.out.println("Not a Paliandrome ");   
        }
    }
}
