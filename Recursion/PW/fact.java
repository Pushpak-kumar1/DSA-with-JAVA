package Recursion.PW;

public class fact {
    public static int factorial(int n) {
        // base case
        if (n == 0) return 1;
        
        // recursive work
        return n * factorial(n-1);  // recurrence relation 
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
}