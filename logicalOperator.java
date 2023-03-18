import java.util.Scanner;

//Logical Operator

public class logicalOperator {
    public static void main(String args[]) {

        try (
                Scanner abc = new Scanner(System.in)) {
            System.out.println("Enter a username and Password ");
            String a, b;
            a = abc.nextLine();
            b = abc.nextLine();
            if ("admin".equals(a) && "Arjun".equals(b)) {
                System.out.println("Login sucessfully done");
            }

            else {
                System.out.println("loging Failled try again");
            }

        }

    }
}