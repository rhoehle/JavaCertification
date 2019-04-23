package oracle.certification;

public class NumericPromotion {

    public static void main(String[] args) {

        // promotion is converting smaller into bigger types
        int x = 5;
        double y = 10.69;

        System.out.println("x + y = " + x + y + " <- Concats the numbers");

        System.out.println("x + y = " + (x + y));

        byte b = 10;
        int c = 5;
        double d = 4.69;

        double result = b + c + d;
        System.out.println("b + c + d = " + result);

        // Casting -> converting bigger types to smaller types
        double myDouble = 55.69;
        int myInt = 4 + (int) myDouble; // <- casting
        System.out.println("Result = " + myInt); // <- int will round down the result

        int anotherInt = 125;
        byte myByte = 15;

        int intResult = anotherInt + myByte;
        byte byteResult = (byte) (anotherInt + myByte);
        System.out.println("intResult = " + intResult + " byteResult = " + byteResult); // <- 'overflow' when goes over


    }

}
