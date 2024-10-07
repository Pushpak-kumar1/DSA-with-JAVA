// Write a function to print the sum of all odd numbers from 1 to n:---------------------------------

import java.util.Scanner;

public class SumOfOdd2 {
    public static int sumOfOddNumber(int n) {
        int sum = 0;
        
        for (int i=1; i<=n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter the number: ");
        int n = sc.nextInt();

        System.out.println("Sum of odd number is: " + sumOfOddNumber(n));
        sc.close();

    }
    
}
