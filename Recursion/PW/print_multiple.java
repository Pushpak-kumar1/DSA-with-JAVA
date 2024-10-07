
package Recursion.PW;
//import java.util.*;

public class print_multiple {
    public static void printMultiple(int num, int k) {
        if(k == 0) {
          // System.out.println(num);
            return;
        }
        printMultiple(num, k-1);
        System.out.println(num * k);
    }
    public static void main(String args[]) {
        int num = 5;
        int k =   10;

        printMultiple(num, k);
    }
}