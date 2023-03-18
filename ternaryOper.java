public class ternaryOper {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 45;
        int max;
        // max = (a > b) ? a : b;
        // System.out.println("ther maximum number is " + max);
        // max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        // System.out.println(max);
        max = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
        System.out.println(max);

    }
}
