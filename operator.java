import java.util.*;

//Arithmatical operator
class operator {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter a two number::");
        int a, b;
        a = abc.nextInt();
        b = abc.nextInt();
        System.out.println("Addition of two number is" + (a + b));
        System.out.println("subtraction of two number is" + (a - b));
        System.out.println("multiplication of two number is" + (a * b));
        System.out.println("Adivision of two number is" + (a / b));
        System.out.println("modulous of two number is" + (a % b));

    }
}