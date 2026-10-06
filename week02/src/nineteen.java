import java.util.*;

public class nineteen {
    public static void main(String[] args) {
        int x, y;

        System.out.println("Please enter the value of x and y:");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        sc.close();

        int r1 = add(x,y);
        System.out.println("Add: " + r1);

        int r2 = subtract(x,y);
        System.out.println("Subtract: " + r2);

        int r3 = multiply(x,y);
        System.out.println("Multiply: " + r3);

        double r4 = divide(x,y);
        System.out.println("Divide: " + r4);
    }

    static int add(int x, int y){
        int result = x + y;
        return result;
    }

    static int subtract(int x, int y){
        int result = x - y;
        return result;
    }

    static int multiply(int x, int y){
        int result = x * y;
        return result;
    }

    static double divide(double a, double b){
        double result = a/b;
        return result;
    }
}
