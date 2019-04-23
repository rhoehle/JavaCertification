package oracle.certification;

public class DecimalNumericPrimitives {

    public static void main(String[] args) {

        float myFloatNumber = 25.6F; // <- needs the "F" or "f" on the float

        // double -> cannot put the underscore to start or with the "." like "_." or after "10.25_"
        double myDouble = 2.69;
        double myOtherDouble = 2.69F; // <- double with float notation
        double anotherDouble = 666.69; //<- do not have to use the "D" (optional -> already assumed)
        System.out.println("myDouble = " + myDouble + " myOtherDouble = " + myOtherDouble + " anotherDouble = " +
                anotherDouble);
        System.out.println();

        double scientificNotation = 5.00125E03; // = 5000.124 = it WILL compile b/c it is correct
        double scientificNotation2 = 5.00125E3;
        double myNotScientificNotedNumber = 5000.125;

        System.out.println("Scientific numbers ----------------------------------------");
        System.out.println("Scientific number E03 = " + scientificNotation);
        System.out.println("Scientific number E3 = " + scientificNotation2);
        System.out.println("Not a scientific number = " + myNotScientificNotedNumber);

        // of exam note: p is used to fool you.
        double hexPI = 0x1.91eb851eb851fp1; // p indicates hexadecimal floating number
        System.out.println();
        System.out.println("Hexadecimal numbers and P -------------------------");
        System.out.println("hexPI = " + hexPI);

    }

}
