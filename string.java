import java.lang.String;
public class string {
    public static void main(String args[])
    {
        char[] newArray  = new char[]{'h','e','l','l','o'};
        String s = "Shashank";
        String s1 = new String(s);
        String s2 = new String(s);
        System.out.println(s2);
        if (s1.compareToIgnoreCase(s2) == 0)
        {
            System.out.println("They are same");
        }
        String s3;
        s3 = s1 + s2;
        System.out.println("After Concatenation " + s3);
        StringBuffer s4 = new StringBuffer(s1);
        s4.append(s3);
        System.out.println(s4);
        s4.reverse();
        System.out.println(s4);
    }
}
