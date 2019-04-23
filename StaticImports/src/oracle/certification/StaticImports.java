package oracle.certification;

import static java.lang.Math.PI;
import static java.lang.Math.min;
import static oracle.certification.Config.*;

public class StaticImports {

    // import static members. Don't have to specify class name. Can be overused.
    public static void main(String[] args) {

        int min = min(3, 8);
        // min and PI are now "static" imported
        System.out.println("Min = " + min);
        System.out.println("PI = " + PI);

        // Config.printConfig(); -> to remove the "Config." portion of the call, you can statically import
        printConfig();


    }

}
