public class NonStatic {
    public void demo(int x, int y) {
        int a = x;
        int b = y;
        int c = a + b;
        System.out.println("Addition of two number is " + c);

    }

    public static void main(String[] args) {

        NonStatic a = new NonStatic();
        a.demo(10, 20);

        System.out.println("Program is sucessfully run ");

    }

}
