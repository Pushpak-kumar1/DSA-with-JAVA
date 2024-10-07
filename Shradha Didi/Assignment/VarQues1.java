package Assignment;


import java.util.Scanner;

public class VarQues1 {
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, avg;
        System.out.println("Enter the first number: ");
        a = sc.nextInt();
        System.out.println("Enter the second number: ");
        b = sc.nextInt();
        System.out.println("Enter the third number: ");
        c = sc.nextInt();

        avg = (a + b + c) / 3;
        
        System.out.println("Average of these numbers = " + avg);
        sc.close();
    }
    
}
