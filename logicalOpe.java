import java.util.*;

public class logicalOpe {
    public static void main(String[] args) {
        System.out.println("Enter a two number");
        Scanner abc = new Scanner(System.in);
        int a, b;
        a = abc.nextInt();
        b = abc.nextInt();

        System.out.println((a > b) && (b < a));
        System.out.println((a > b) || (a < b));
        System.out.println(a != b);
        // System.out.println(a>b && b<a);

    }
}
