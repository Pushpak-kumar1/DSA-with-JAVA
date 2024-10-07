package Recursion.PW;
//import java.util.*;

public class p_pow_q {
    public static int pow(int p, int q) {
        // base case
        if( q == 0) return 1;

        return pow(p, q-1) * p;
    }

    public static int pow2(int p, int q) {
        if(q == 0) return 1;

        int smallPow = pow2(p, q/2);
        if(q % 2 == 0) {
            return smallPow * smallPow;
        }
        return smallPow * smallPow * p;
    }
    public static void main(String args[]) {
        int p = 2;
        int q = 4;
        
        System.out.println(pow(p, q));
        System.out.println(pow2(p, q));
    }
}
