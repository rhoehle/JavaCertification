package oracle.certification;

public class Main {

    // psvm: this just an array of type string -> can use the Array methods to leverage output
    public static void main(String[] args) {

        System.out.println("args-size = " + args.length);

        // for loop
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]=" + args[i]);
        }
    }

}
