package oracle.certification;

public class PrimitiveWrapperTypes {

    // Wrappers start with UPPER case letters and are like the primitive declaration otherwise

    public static void main(String[] args) {

        int myInt = 69;
        // Boxing: putting your int inside the Wrapper Integer
        Integer myInteger = new Integer(699);
        // This is boxing, but you do not have to use the "new Integer" (redundant)
        Integer myInteger2 = 6969;
        // pass in string or int
        Integer myInteger3 = Integer.valueOf(6);
        // String -> parsed to int
        Integer myInteger4 = Integer.parseInt("9");
        // Have to us "Integer" to set to null
        Integer myInteger5 = null;

        System.out.println("Integer Values:");
        System.out.println("---------------------------------------------------------");
        System.out.println("myInteger = " + myInteger);
        System.out.println("myInteger2 = " + myInteger2);
        System.out.println("myInteger3 = " + myInteger3);
        System.out.println("myInteger4 = " + myInteger4);
        System.out.println("myInteger5 = " + myInteger5);

        // Unboxing -> Converting wrapper to primitive
        int myInt3 = myInteger3;

        // Autoboxing ->
        Integer myInteger7 = myInt;

        printSum(5, 6); // <-- This will be autoboxed by compiler
        // Not autoboxing (Already converted??)
        printSum(myInteger, myInteger3);
    }

    private static void printSum(Integer first, Integer second) {
        Integer sum = first + second;
        System.out.println("Sum = " + sum);

        short myPet = 5;
        System.out.println(myPet);
    }


}
