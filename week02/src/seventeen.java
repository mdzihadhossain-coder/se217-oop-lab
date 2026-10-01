import java.util.*;

public class seventeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single word: ");
        String s = sc.next();
        System.out.println("You Entered : " + s);

        sc.nextLine();

        System.out.print("Enter a full sentence: ");
        String s1 = sc.nextLine();
        System.out.println("You Entered : " + s1);

        sc.close();
    }
}