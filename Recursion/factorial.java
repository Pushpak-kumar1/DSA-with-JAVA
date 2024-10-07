package Recursion;

public class factorial {
    public static int fact(int n) {
        //base case
        if (n == 0) {
          return 1;
        }
        // recursive work - smaller problem
        int fnm1 = fact(n-1);
        // self work - bigger problem
        int fn = n * fnm1;  // n * fact(n-1)
        return fn;
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println(fact(n));
    }
}
