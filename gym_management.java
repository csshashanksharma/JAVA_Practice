import java.util.Scanner;
public class gym_management {
    public static void main(String args[])
    {
        String name;
        double amount = 0 ;
        int baseprice = 1500;
        int duration ;
        int age;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name ");
        name = s.nextLine();
        System.out.println("Enter the age ");
        age = s.nextInt();
        System.out.println("Enter the duration in months");
        duration = s.nextInt();
        if(duration <= 6)
        {
            amount = duration*baseprice;
        }
        else if(duration > 6 && duration <= 12)
        {
            amount = baseprice*6 + (duration-6)*0.9*baseprice;
        }
        else if (duration > 12)
        {
            amount = baseprice*6 + 6*0.9*baseprice + (duration - 12)*0.6*baseprice;
        }
        System.out.println("Name" + name);
        System.out.println("Total amt :" + amount);
    }

}
