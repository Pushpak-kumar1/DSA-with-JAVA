package YouTube;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you age: ");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Baby");      

        }
        
        // To check no. whether is odd or even

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
            sc.close();
        }

    }
    
}
