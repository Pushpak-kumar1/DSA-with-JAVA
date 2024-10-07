//package YouTube.YouTubeQuiz;

import java.util.Scanner;

public class Calculator {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a : ");  //taking first number as input
        int a = sc.nextInt();

        System.out.print("Enter the operator (+,-,*,/,%)"); //taking expression as input
        char operator = sc.next().charAt(0);

        System.out.print("Enter value of b : "); //taking second number as input
        int b = sc.nextInt();

        switch (operator) {
               case '+': 
                   System.out.println("Addition is :" + (a + b));
                   break;
               case '-': 
                   System.out.println("Subtraction is : " + (a - b));
                   break;
               case '*': 
                   System.out.println("Multiplication is : " + (a * b));
                   break;
               case '/': 
                   System.out.println("Division is : " + (a / b));
                   break;
               case '%': 
                   System.out.println("Modulus is : " + (a % b));
                   break;
               default: 
                   System.out.println("SORRY! My Calculator is not that Advance");

                   sc.close();
              }
       }
}