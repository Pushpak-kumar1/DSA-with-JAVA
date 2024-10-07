package Assignment;


import java.util.Scanner;

public class QuesOfBreak {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = 0;

        do {
            System.out.print("Please Enter the number: ");
            number = sc.nextInt();
            System.out.println(number);
        } while(number % 10 != 0);
            sc.close();
    }
}
