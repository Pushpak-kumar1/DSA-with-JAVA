package YouTube;

import java.util.Scanner;

public class FuncFactorial {
    public static int calcualteFactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid Number!");
        }
        int factorial = 1;
        for (int i=1; i<=n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int binomialCofficient(int n, int r) {  // function for binomial cofficient:
        int fact_n = calcualteFactorial(n);
        int fact_r = calcualteFactorial(r);
        int fact_nmr = calcualteFactorial(n - r);

        int binCoff = fact_n / (fact_r * fact_nmr);
        return binCoff;
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        //System.out.println("Factorial of this number is: " + calcualteFactorial(n));
        int result = calcualteFactorial(n);
        System.out.println(result);

        System.out.println(binomialCofficient(5, 2));
        sc.close();

    }
}
