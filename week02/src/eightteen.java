package main;

public class eightteen {
    public static void main(String[] args) {
        System.out.println("Program Start:");
        sayHi(); sayWelcome();

        int addition = getSum(100, 50);
        System.out.println("Result of Addition: " + addition);

        int multiplication =getMul(10,20);
        System.out.println("Result of Multiplication: "+multiplication);
    }

    static int getSum(int x, int y) {
        int sum = x + y;

        return sum;
    }

    static int getMul(int x,int y){
        int mul = x * y;

        return  mul;
    }

    static void sayHi() {
        System.out.print("Hi, ");
    }

    static void sayWelcome(){

        System.out.println("Welcome to the Programming World!");
    }
}