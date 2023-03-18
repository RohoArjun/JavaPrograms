import java.math.BigInteger;
import java.util.*;

public class Biginteger {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        String number1;
        String number2;
        System.out.println("Enter teo big data");
        number1 = abc.nextLine();
        number2 = abc.nextLine();

        BigInteger frist = new BigInteger(number1);
        BigInteger secound = new BigInteger(number2);
        BigInteger sum;
        sum = frist.add(secound);
        System.out.println(sum);

    }

}
