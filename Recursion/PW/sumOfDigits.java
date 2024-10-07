package Recursion.PW;
//import java.util.*;

public class sumOfDigits {
    public static int sum_OfDigits(int num) {
        //base case
        if(num >= 0 && num <= 9) return num;

        return sum_OfDigits(num/10) + (num%10);
    }

    static int count = 0;
    public static int countDigits(int num) {
      //  int count = 0;
        if(num > 0) {
            count++;
            countDigits(num/10);
        }
        return count;
    }

    public static void main(String args[]) {
        int num = 12345;

        System.out.println(sum_OfDigits(num));
        System.out.println(countDigits(num));
    }
}
