
public class fifteen {
    
    public static void main(String[] args) {

        char stArray[] = {'H', 'i'};
        String st = "Hi, I'm good.";
        String s2 = new String("Bangladesh");

        System.out.println(st + " " + s2);

        // String Length
        String s = "Dhaka, Bangladesh";
        int l = s.length();
        System.out.println("Length: " + l);

        // Upper Case and Lower Case
        System.out.println("Upper Case: " + s.toUpperCase());
        System.out.println("Lower Case: " + s.toLowerCase());

        // Finding Character at a Specific Index
        System.out.println("Char at index 0: " + s.charAt(0));
        System.out.println("Char at index 4: " + s.charAt(4));

        // Comparing Two Strings
        String s3 = "Hi";

        // Checking equality
        if(s.equals(s3)) {
            System.out.println("They are equal.");
        } else {
            System.out.println("Not equal.");
        }

        //Another
        if(s == s) {
            System.out.println("They are equal.");
        } else {
            System.out.println("Not equal.");
        }
    }
}
