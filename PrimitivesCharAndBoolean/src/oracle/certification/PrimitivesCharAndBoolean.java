package oracle.certification;

public class PrimitivesCharAndBoolean {

    public static void main(String[] args) {

        char ch = 'a'; // use ' '

        // char ch1 = 'ab'
        char ch1 = '1';
        char uniChar = '\u0389'; // <- unicode characters
        char romanNumb = '\u216C';

        System.out.println("From ASKII table and representation can be found there");
        System.out.println("ch1 = " + ch1);
        System.out.println("uniChar = " + uniChar);
        System.out.println("romanNumb = " + romanNumb);

        boolean myBool = true;
        boolean myFalseBool = false;

        System.out.println("myBool = " + myBool + "& myFalseBool = " + myFalseBool);


    }

}
