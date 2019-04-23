package oracle.certification;

public class UnaryOperators {

    static boolean myBool;

    public static void main(String[] args) {

        // Unary's are: + - ++ -- !

        int x = +3;
        System.out.println("x = " + x);

        double y = -10;
        double z = -y; //<-- changes the value to - of what it was
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        // boolean myBool; //<-- set to false by default
        System.out.println("Default myBool init: " + myBool);
        boolean myOffsettingBool = !myBool; // <-- ! is not
        System.out.println("myoffsettingBool is " + myOffsettingBool);
        myOffsettingBool = !myOffsettingBool;
        System.out.println("Change myoffsettingBool with a ! and it is now " + myOffsettingBool);

        // increment and decrement operators -> higher order than any other mathematicals
        int myInt = 5;
        // myInt = myInt + 1;
        // int myOtherInt = myInt;
        int myOtherInt = ++myInt; // --> myInt actually is 5, the expression is myInt + 1
        System.out.println("myInt = " + myInt + " myOtherInt = " + myOtherInt);

        int newInt = 6;
        // int anotherNewInt = newInt;
        // newInt = anotherNewInt + 1;
        int anotherNewInt = newInt++;
        System.out.println("newInt = " + newInt + " anotherNewInt = " + anotherNewInt);

        int count = 0;
        System.out.println(count);
        System.out.println(++count);
        System.out.println(count);
        System.out.println(count--);
        System.out.println(count);

        int counter = 0;
        while (counter < 5) {
            System.out.println(counter++);
        }

        // Exam questions -- the BS they will ask -- the increment and decrement affects the value of the variables as
        // they go from left to right
        int e = 3;
        int f = ++e * 5 / e-- + --e;
        // ++e -> 4
        // 4 * 5 / e-- + --e
        // 4 * 5 / 4 + --e;
        // 4 * 5 / 4 + 2;
        System.out.println("e = " + e + " f = " + f);

        //
        int g = 6;
        int h = 2;
        int i = ++h + --g * 3 + 2 * g++ - h-- % --g;
        // h = 3 g = 6
        // 3 + --g * 3 + 2 * g++ - h-- % --g
        // 3 + 5 * 3 + 2 * g== - h-- % --g
        // 3 + 5 * 3 + 2 * 5 - h-- % --g
        // h = 2, g = 6
        // 3 + 5 * 3 + 2 * 5 - 3 % 5
        // g = 5
        // 3 + 15 + 10 - 3
        // 18 + 10 - 3 = 25
        System.out.println("g = " + g + " h = " + h + " i = " + i);
    }
}














