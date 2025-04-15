import java.io.*;

import java.util.*;
class Solution {

  public static String[] treasureFind(String inst[][] , String[] trea)

  {

    HashSet <String> treasures = new HashSet<>();

    for (int i = 0; i < trea.length; i++)

    {

      String s = trea[i];

      treasures.add(s);

    }

    //System.out.println(inst[0].length);

    String[] result = new String[trea.length];

    int index = 0;

    String[] point = new String[inst.length];

    int k = 0;
    for (int i = 0; i < inst.length; i++)

    {

        point[k] = inst[i][1];

        k = k + 1;

    }

    HashMap <String , Integer> freq = new HashMap<>();

    for (int i = 0;i < point.length; i++)

    {

      String s1 = point[i];

      if (freq.containsKey(s1))

      {

        freq.put(s1, freq.get(s1) + 1);

      }

      else

      {

        freq.put(s1,1);

      }

    }
    // for (String s : freq.keySet())
    // {
    //   System.out.println(s +"-->" + freq.get(s));
    // }
    
    for(int i = 0; i < inst.length; i++)

    {

      String source = inst[i][0];
      //System.out.println(source + "-->" + freq.get(source));
      if (treasures.contains(source) && freq.containsKey(source))
      {
        //System.out.println(source + "-->" + freq.get(source));
        if (freq.get(source) >= 2)
          {
              result[index] = source;

              index = index + 1; 
          }
      }

    }

    return result;
  }

  public static void main(String[] argv) {

      String[][] instructions_1 = {

      {"jasmin", "tulip"},

      {"lily", "tulip"},

      {"tulip", "tulip"},

      {"rose", "rose"},

      {"violet", "rose"},

      {"sunflower", "violet"},

      {"daisy", "violet"},

      {"iris", "violet"}

    };



    String[][] instructions_2 = {

      {"jasmin", "tulip"},

      {"lily", "tulip"},

      {"tulip", "violet"},

      {"violet", "violet"}

    };



    String[] treasure_rooms_1 = {"lily", "tulip", "violet", "rose"};

    String[] treasure_rooms_2 = {"lily", "jasmin", "violet"};

    String[] treasure_rooms_3 = {"violet"};
    String[] result = new String[treasure_rooms_1.length];
    String[] result1 = new String[treasure_rooms_1.length];

    //System.out.println(instructions_1.length);
    // result = treasureFind(instructions_1, treasure_rooms_1);   
    // for (int i = 0; i < result.length; i++)
    // {
    //   System.out.println(result[i]);
    // }
    result1 = treasureFind(instructions_2, treasure_rooms_2);   
    for (int i = 0; i < result1.length; i++)
    {
      System.out.println(result1[i]);
    }
  }

}
