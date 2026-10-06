import java.util.Scanner;

public class seventeen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("User Profile");

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your target CGPA: ");
        double cgpa = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Enter your full name and university: ");
        String bio = scanner.nextLine();

        System.out.println("Name & Institution : " + bio);
        System.out.println("Age                : " + age);
        System.out.println("Target CGPA        : " + cgpa);

        scanner.close();
    }
}
