import java.util.*;

import javax.sql.rowset.spi.SyncResolver;

public class fehrecheinttocelcius {
    public static void main(String[] args) {

        Scanner abc = new Scanner(System.in);
        System.out.println("Enter a Fehrenit value");
        int temp = abc.nextInt();
        temp = ((temp - 32) * 5) / 9;
        System.out.println(temp);

    }

}
