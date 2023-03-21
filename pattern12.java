public class pattern12 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            i = i + 2;
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
                j = j + 2;

            }
            System.out.println();
        }
    }
}
