package oracle.certification;

public class ArithmeticOperators {

    public static void main(String[] args) {

        int result = 3 - 2 + 2 * 2 + 3; // <-- the multiplication comes first then, left to right
        System.out.println("The result: " + result);

        int result2 = 4 / 2 + 1 - 4 * 2 + 10;
        System.out.println("result2 = " + result2);

        // unary operators - tricky
        System.out.println("--- Unary -------------------------------------------");
        int a = 4;
        int b = 3 - 2 * --a; // -- you decrement by one, then use = 3
        // 3 - 2 * 3
        // 3 - 6
        // b = -3 a = 3
        System.out.println("a = " + a + " b = " + b);

        a = 4;
        b = 3 - 2 * a--; // use a in the WHOLE statement, then decrement -> so, basically ignore, but a is decreased to 3
        // 3 - (2 * 4) =
        System.out.println("a = " + a + " b = " + b);
        int total = a + b;
        System.out.println(total);

        long c = 2;
        long d = 4 + 3 * c++; // <- once again ignore the increment b/c it is AFTER the operation, it does increase c to 3
        // 4 + 3 * 2
        // 4 + 6 = 10
        System.out.println("c = " + c + " d = " + d);

        System.out.println("---Brackets---------------------------------------------------");
        long result3 = 10 - 3 * (2 + 1) -4 / (1 + 3); // <-- brackets first
        // 10 - 3 * 3 - 4 / 4
        // 10 - 9 - 1 = 0
        System.out.println("result3 = " + result3);

        System.out.println("---Modulus--------------------------------------------------- ");
        int i = 10;
        int j = 3;

        // 10 % 3 -> remainder is 1
        int k = i % j; // -> remainder is 1
        int e = 10 % 2; // -> remainder is 0
        System.out.println("int k = " + k + "  int e = " + e);

        int f = 12;
        int g = 5;
        int h = 2;
        // 12 / 2 - 10 % 7 - 2 * 12 % 5 - 2 * 3
        // 6 - 3 - 24 % 5 - 6
        // 6 - 3 - 4 - 6 = -7
        int m = f / 2 - 10 % (4 + 3) - 2 * f % g - h * 3;

        System.out.println("m = " + m);
    }

}
