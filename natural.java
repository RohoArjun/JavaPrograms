
import java.util.*;

public class natural {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a;
        int sum = 0;
        System.out.println("Enter a number::");
        a = sc.nextInt();
        for (int i = 0; i <= a; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

    }

}
