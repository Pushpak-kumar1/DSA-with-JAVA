package YouTube;

import java.util.Scanner;

public class FunctionOverloading {
    //function to calculate sum of 2 numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    // func to calc sum of 3 numbers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        System.out.println(sum(a, b));
        System.out.println(sum(a, b, c));

        sc.close();
    }
    
}
