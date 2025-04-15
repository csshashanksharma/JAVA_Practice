import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;
public class xorBeautiful {
    public int findXor(int num)
    {
        int xorSum = 0;
        ArrayList <Integer> list = new ArrayList <>();
        while (num > 0)
        {
            list.add(num%10);
            num = num/10;
        }
        for (int i = 0; i < list.size()-1 ; i++)
        {
            xorSum = xorSum ^ list.get(i);
        }
        return xorSum;
    }
    public int findAvg(int num)
    {
        int min_val = Integer.MAX_VALUE;
        int max_val = Integer.MIN_VALUE;
        while (num > 0)
        {
            int digit  = num% 10;
            min_val = Math.min(min_val,digit);
            max_val = Math.max(max_val , digit);
            num = num/10;
        }
        return (max_val + min_val)/2;
    }
    public int findXorBeauty(int[] range)
    {
        int count = 0;
        for  (int i = range[0]; i <= range[1]; i++)
        {
            int num = i;
            int XorSum = findXor(num);
            int avgSum = findAvg(num);
            if (XorSum > avgSum)
            {
                count = count + 1;
            }
        }
        return count;
    }
    public static void main (String args[])
    {
        Scanner s = new Scanner(System.in);
        int[] range = new int [2];
        System.out.println("Enter the Lower Limit");
        range[0] = s.nextInt();
        System.out.println("Enter the Upper Limit");
        range[1] = s.nextInt();

        xorBeautiful x = new xorBeautiful();
        int result = x.findXorBeauty(range);
        System.out.println(result);
    }
}
