//variables 

public class comments {

    int a = 10; // instance variable
    static int b = 100; // static variable

    public static void main(String args[]) {
        int c = 23; // local variable
        final int D = 30; // final variable
        comments demo = new comments(); // object create of class comments
        System.out.println(demo.a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(D);

    }
}
