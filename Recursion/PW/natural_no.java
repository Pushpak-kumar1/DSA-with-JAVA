package Recursion.PW;

//import java.util.*;

public class natural_no {
    public static void printIncreasing(int n) {
         // base case
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        // recursive work
        printIncreasing(n - 1);
         // self work
        System.out.print(n + " ");
    }
   
        public static void printDec(int n) {
            // base case
            if (n == 1) {
                System.out.println(n);
                return;
            }
            // self work
            System.out.print(n + " ");
            // recursive work
            printDec(n-1);
        }
    
    public static void main(String[] args) {
        int n = 10;

        printIncreasing(n);
        System.out.println();
        printDec(n);
    }
}
