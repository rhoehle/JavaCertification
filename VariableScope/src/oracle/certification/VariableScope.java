package oracle.certification;

public class VariableScope {

    static int myNewInt = 69;

    public static void main(String[] args) {

        // only available inside the main method
        int myLocalInt = 6900;

        { // Random code block -> vars local to it have to be in code block or encompassed by another like main
            int myOtherInt = 699;
            System.out.println("myOtherInt = " + myOtherInt);
            System.out.println("inOverallCodeblockInt myLocalInt = " + myLocalInt);
        }
        System.out.println("myLocalInt = " + myLocalInt);
        System.out.println("myNewInt = " + myNewInt);

        int myOtherInt = 44;

        System.out.println("myOtherInt = " + myOtherInt);
    }
    public static void myMethod() {

    }
}
