import java.util.Scanner;

public class enum2 {
    public enum  weekDay
    {
        MONDAY , 
        TUESDAY , 
        WEDNESDAY ,
        THURSDAY, 
        FRIDAY ,
        SATURDAY ,
        SUNDAY;
    }
    public static  void check(weekDay day)
    {
        switch(day)
        {
            case MONDAY :
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
            System.out.println("WeekDay");
            break;
            case SATURDAY :
            case SUNDAY :
            System.out.println("Week End");
        }
    }
    public static void main (String args[])
    {
        String input;
        System.out.println("Enter the input String");
        Scanner s = new Scanner(System.in);
        input = s.nextLine().toUpperCase();
        weekDay day = weekDay.valueOf(input);
        check(day);
    }
} 
