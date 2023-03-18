public class factorial {
    public static void main(String[] args) {
        int n, c, fact = 1;
        n = 10;
        if (n < 0) {
            System.out.println("its negetive number");
        } else {
            for (c = 1; c <= n; c++) {
                fact = fact * c;

            }
            System.out.println(fact);
        }
    }
}
