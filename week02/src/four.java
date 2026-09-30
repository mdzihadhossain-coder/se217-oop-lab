import java.util.*;
import java.util.*;

public class four {
    public static void main(String[] args) {

        int a1 = 10;
        int b1 = -5;
        int c1 = 20;

        float avg1 = (a1 + b1 + c1) / 3;
        System.out.println("Average of a, b, and c is: " + avg1);


        float avg2 = (float)(a1 + b1 + c1) / 3;
        System.out.println("Average of a, b, and c is: " + avg2);

        long a2 = 102422L;
        long b2 = -52423L;
        long c2 = 20234L;
        float avgLong = (float)(a2 + b2 + c2) / 3;
        System.out.println("Average of a, b, and c is: " + avgLong);

        boolean boolVal = true;
        System.out.println("Value of x is: " + boolVal);

        char charVal = '5';
        charVal = '@';
        System.out.println("Value of x is: " + charVal);

        int x = 20, y = 4, z = 6;
        System.out.println("Sum of the values is: " + (x + y + z));

    }
}