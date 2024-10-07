
import java.util.Scanner;

public class SumOfNatu {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        // int i = 1;        // With the help of while loop 
        // while (i <= n) {
        //     sum += i;
        //     i++;

        for (int i = 1; i <= n; i++) {  // this is done with the for loop
            sum += i;
        }
        System.out.println(sum);
        sc.close();
    }
}
