package Recursion.PW;
//import java.util.*;

public class HCFandLCM {
    public static int hcf(int num1, int num2) {
        if(num2 == 0) return num1;

        return hcf(num2, num1 % num2);
    }
    public static void main(String args[]) {
        int num1 = 36;
        int num2 = 24;

        int onum1 = num1;
        int onum2 = num2;

        while(num1 % num2 != 0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        int gcd = num2;
        int lcm = (onum1 * onum2) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);

        System.out.println(hcf(num1, num2));
    }
}
