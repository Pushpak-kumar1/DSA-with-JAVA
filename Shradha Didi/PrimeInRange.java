
//import java.util.*;

public class PrimeInRange {
    
    public static void printPrimeNumber(int n) {
        if (n == 2) {
            System.out.println(n + "is a Prime Number");
        }

        for (int i=2; i<=n-1; i++) {
            if (n % i != 0) {
                System.out.print(i + " ");
            } 
        }
        System.out.println();

    }

    public static void main (String args[]) {
        //Scanner sc = new Scanner(System.in);

        printPrimeNumber(10);

        //sc.close();
    }
}
