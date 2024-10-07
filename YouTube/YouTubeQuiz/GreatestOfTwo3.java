// Write a function which takes in 2 numbers and returns the greater of those two:---------------------

import java.util.*;

public class GreatestOfTwo3 {
    public static int greaterOfTwoNumber(int a, int b) {
        if (a > b) {
            return a; 
        } else {
            return b;
        }
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.println( greaterOfTwoNumber(a, b));
        sc.close();

    }
    
}
