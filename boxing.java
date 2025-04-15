public class boxing {
    public static void main(String args[])
    {
        Integer boexedInt = Integer.valueOf(20);
        Boolean boxedBoolean = Boolean.valueOf("True");
        Float boxedFloat = Float.valueOf(345);


        int unboxedInt = boexedInt.intValue();
        boolean unboxedBoolean = boxedBoolean.booleanValue();
        float unboxedFloat = boxedFloat.floatValue();
        System.out.println(boexedInt);
        System.out.println(unboxedInt);
        System.out.println(unboxedBoolean);
        System.out.println(boxedBoolean);
        
    }
}
