package oracle.certification;

public class CompoundAssignmentOperators {

    public static void main(String[] args) {

        int x = 2;
        int z = 3;

        x = x * z;
        System.out.println("x = " + x);

        x *= z; // <-- shorthand version
        System.out.println(" x = " + x);

        // without explicit cast
        long a = 10;
        long b = 4;
    }

}
