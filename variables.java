public class variables {
    static int a = 10;

    void fun() {
        int b = 10;
        System.out.println(a + " " + b);
        ++a;
        ++b;
    }

    public static void main(String args[]) {
        variables ref = new variables();
        ref.fun();
        ref.fun();
    }

}
