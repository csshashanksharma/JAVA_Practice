import java.util.*;

public class enums {
    public enum weekDay
    {
        MONDAY , 
        TUESDAY , 
        WEDNESDAY ,
        THURSDAY, 
        FRIDAY ,
        SATURDAY ,
        SUNDAY;
    }
    public static void main (String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The day");
        String input= s.nextLine().toUpperCase();
        weekDay day = weekDay.valueOf(input);
        boolean result ; 
        result = check(day);
        System.out.println((result));

    }
    public static boolean check(weekDay day)
    {
        switch(day)
        {
            case  MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY: 
            System.out.println("Week day");
            return true;
            case SATURDAY:
            case SUNDAY:
            System.out.println("Week End");
            return false;
            default :
            System.out.println("Invalid");
        }
        return false;
    }
}
