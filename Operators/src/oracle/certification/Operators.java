package oracle.certification;

public class Operators {

    public static void main(String[] args) {

        // Cast when going from a larger type to a smaller data type
        int x =  (int)1.0;
        short y = (short)19812345;
        int z = (int)9f;
        long t = 1923012345678910L;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("t = " + t);

        // overflow and underflow with byte (-128 to 127)
        byte myByte = 127;
        byte myByte2 = -128;
        System.out.println("myByte = " + myByte);
        System.out.println("myByte2 = " + myByte2);

       // myByte = myByte + 1;
        myByte++; // --> goes around and goes to the smallest value
        // myByte2 = myByte2 - 1;
        myByte2++; // -->

        System.out.println("myByte = " + myByte);
        System.out.println("myByte2 = " + myByte2);

        short a = 10;
        short b = 20;
        // short c = a * b; // <-- autopromotes to ints so have to cast
        short c = (short)(a * b);
        System.out.println("c = " + c);
    }

}
