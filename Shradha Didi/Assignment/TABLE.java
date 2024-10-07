package Assignment;

import java.util.Scanner;

public class TABLE {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to print table: ");
        int number = sc.nextInt();

        int table = 1;
        for (int i = 1; i <= 10; i++) {
            table = number * i;
           // System.out.println(table);
            System.out.println(number + " * " + i + " = " + table);
        }
        sc.close();
    }
}
