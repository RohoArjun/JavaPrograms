public class swapTwo {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("original value of x is :" + x);
        System.out.println("original value of y is :" + y);

        int z = x;

        x = y;
        y = z;

        System.out.println("the swaping valur of x is :" + x);
        System.out.println("the swaping valur of y is :" + y);
    }
}
