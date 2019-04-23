package oracle.certification;

public class WholeNumericPrimitives {

    public static void main(String[] args) {

        long max = 321654978546546L; // <- Have to add the letter "L" to the end of the number or it will not get picked up as a long value due to integer conversion
        long n = 23000;


        // Octal numbers 0 - 7
        int oct = 7;
        int firstOct = 010; // 8 in decimal
        int secondOct = 022; // 18 in decimal
        int sumOct = firstOct + secondOct;
        System.out.println("Octals --------------------------------");
        System.out.println("First = " + firstOct + " Second = " + secondOct);
        System.out.println("Decimal sum = " + sumOct + " octSum = " + Integer.toOctalString(sumOct));
        System.out.println();

        // hexidecimal 0 - 9 and A - F
        int firstHex = 0xF; // 15 decimal
        int secondHex = 0x1E; // 30 decimal
        int sumHex = firstHex + secondHex; // 45 in decimal, 2d hex
        System.out.println("Hexi-decimals----------------------------");
        System.out.println("First = " + firstHex + " Second = " + secondHex);
        System.out.println("DecimalSum = " + sumHex + " hexSum = " + Integer.toHexString(sumHex));
        System.out.println();

        // binary 0 -1
        int firstBin = 0b1001; // 9 decimal
        int secondBin = 0b0111; // 7 decimal
        int sumBin = firstBin + secondBin;
        System.out.println("Binary ------------------------------------");
        System.out.println("First binary, firstBin = " + firstBin + " Second binary, secondBin = " + secondBin);
        System.out.println("Decimal Sum of binaries is " + sumBin + ", variable binSum = " + Integer.toBinaryString(sumBin));
    }
}
