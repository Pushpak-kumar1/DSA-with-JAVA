//Make a function to add 2 numbers and return the sum.

package YouTube;

import java.util.Scanner;

public class FuncAdd {
    public static int addition(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first value : ");
        int a = sc.nextInt();
        System.out.print("Enter the second value : ");
        int b = sc.nextInt();

        //int sum = addition(a, b);
        System.out.print("Sum of two number is : " + addition(a, b));
        sc.close();

    }
    
}
