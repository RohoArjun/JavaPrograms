import java.util.Scanner;

class A {
    public static void main(String args[]) {

        try (Scanner abc = new Scanner(System.in)) {
            System.out.println("Enter Username and Passowrd");

            String userName = abc.nextLine();
            String pass = abc.nextLine();

            if (("admin".equals(userName)) && ("cybersucess".equals(pass))) {
                System.out.print("Welcome to CyberSucess");
            }

            else {
                System.out.print("Wrong User");
            }

        }
    }
}