package oracle.certification;

public class DeclaringAndInitializingVariables {

    public static void main(String[] args) {

        // declare and initializing in two lines:
        int myNum;
        myNum = 69;
        System.out.println("myNum = " + myNum);

        double mydouble = 69.69;
        System.out.println("myDouble = " + mydouble);

        // can declare multiple variables on the same line -> exam will do this
        float myFloat, myFloat2, myFloat3;
        float myFloat4; float myFloat4;

        float myFloat6 = 5f, myFloat7 = 10f, myFloat8; // <-- All legal and may be on test
        boolean b1, b2;

        // double d1, double d2; // will not compile - multiple types in one line

        int i1;
        int i2, i3;

        double $someDouble;
        double _underscoreisOK;
        // double 3isanumberAndCannotBegingwithANumber;

    }

}
