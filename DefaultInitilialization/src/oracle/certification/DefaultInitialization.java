package oracle.certification;

public class DefaultInitialization {

    static boolean myBool;
    static byte myByte;
    static short myShort;
    static  int myInt;
    static long myLong;
    static float myFloat;
    static double myDouble;
    static char myChar;

    public static void main(String[] args) {

        System.out.println("Initializations:");
        System.out.println("-----------------------------------------------------------------------------");
        // show all the initial variable assignments
        System.out.println("myBool = " + myBool); // <- Set to false
        System.out.println("myByte = " + myByte);
        System.out.println("myShort = " + myShort);
        System.out.println("myInt = " + myInt);
        System.out.println("myLong = " + myLong);
        System.out.println("myFloat = "+ myFloat);
        System.out.println("myDouble = " + myDouble);
        System.out.println("myChar = " + myChar);
    }
}
