public class revPate {
    public static void main(String args[]) {

        int i, j, row = 6;

        for (i = 0; i < row; i++) {

            for (j = 2 * (row - i); j >= 0; j--) {
                // prints space between two stars

            }

            for (j = 0; j <= i; j++) {
                // prints star
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}