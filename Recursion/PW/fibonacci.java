package Recursion.PW;

public class fibonacci {
    public static int fibSeris(int n) {
        // base case
        if (n == 0 || n == 1) 
            return n;

        // sub-problem  -> recursive work
        return fibSeris(n-1) + fibSeris(n-2);
    }
    public static void main(String[] args) {
        /*if you want to print
          for (int i=0; i<10; i++) {
            System.out.println(fibSeris(i));
        }
        */
        System.out.println(fibSeris(6));
    }
}
