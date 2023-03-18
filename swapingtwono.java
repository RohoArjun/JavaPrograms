public class swapingtwono {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("original value of x is " + x);
        System.out.println("original value of y is " + y);

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("swaping value of x is ::" + x);
        System.out.println("swaping value of y is ::" + y);
    }
}
