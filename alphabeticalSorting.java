import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
public class alphabeticalSorting {
    public String[] sort(String[] arr)
    {
        String[] result = new String[arr.length];
        HashMap <String , Integer> freq  = new HashMap <>();
        for (int i = 0; i < arr.length; i++)
        {
            String s = arr[i];
            s.toLowerCase();
            freq.put(s, (int)s.charAt(0));
        }
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(freq.entrySet());
        Collections.sort(entryList, (e1,e2) -> e1.getValue().compareTo(e2.getValue()));
        LinkedHashMap <String , Integer> sorted = new LinkedHashMap<>();
        
        for(Map.Entry<String , Integer> entry : entryList)
        {
            sorted.put(entry.getKey(),entry.getValue());
        }
        int k = 0;
        for (String s : sorted.keySet())
        {
            result[k] = s;
            k = k + 1;
        }
        return result;
    }
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array of strings ");
        String arr[] = new String[5];
        for (int i = 0; i < 5; i++)
        {
            arr[i] = s.nextLine();
        }
        alphabeticalSorting a = new alphabeticalSorting();
        String[] result = a.sort(arr);
        for (int i = 0; i < result.length; i++)
        {
            System.out.print(" ," + result[i] + " ");
        }
    }
}
