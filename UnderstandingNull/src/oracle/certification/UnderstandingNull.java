package oracle.certification;

public class UnderstandingNull {

    static  Object myObject = new Object();
    static Object myOtherObject; // <- set to null by default
    // static int myInt = 0; <- redundant... already 0
    static String myString;

    public static void main(String[] args) {

        Object myLocalObject = new Object();
        Object anotherLocalObject;

        String name = "Java";
        String anotherName = null;

        System.out.println("----------------------------------------");
        System.out.println("myObject = " + myLocalObject);
        System.out.println("anotherLocalObject = " + myLocalObject);

        System.out.println("-----------------------------------------");
        System.out.println("name = " + name);
        System.out.println("anotherName = " + anotherName);

        myString = "Java";
        System.out.println("------------------------------------------");
        System.out.println("myString = " + myString);
        myString.toLowerCase();

        System.out.println("myString = " + myString);
    }

}
