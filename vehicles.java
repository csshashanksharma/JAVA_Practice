public class vehicles {
    public int[] totalVehicles(int v , int w)
    {
        int[]  result = new int[2];
        result[0] = (w/2) - v;
        result[1] = v - result[0];
        return result;
    }
    public static void main (String args[])
    {
        vehicles v = new vehicles();
        int[] result = new int[2];
        result = v.totalVehicles (5,14);
        System.out.println("Number of four wheelers are : "+result[0]);
        System.out.println("Number of four wheelers are : "+result[1]);
    }
}
