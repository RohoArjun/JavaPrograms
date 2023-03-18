public class largenumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        int c = 20;
        int large = (a > b) ? (a > c ? a : b) : (b > c ? b : c);
        System.out.println(large);
    }
}
