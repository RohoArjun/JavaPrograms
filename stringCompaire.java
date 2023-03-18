import java.util.*;

public class stringCompaire {
    public static void main(String[] args) {
        String s1, s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a frist string");
        s1 = sc.nextLine();
        System.out.println("Enter a Secound String");
        s2 = sc.nextLine();
        if (s1.compareTo(s2) > 0) {
            System.out.println("String 1 is grater than string two");
        } else if (s1.compareTo(s2) < 0) {
            System.out.println("String 2 is greater than string 1");
        }

        else {
            System.out.println("Both string are equal");
        }

    }
}
