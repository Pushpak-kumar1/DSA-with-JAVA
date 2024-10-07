package Assignment;


import java.util.Scanner;

public class OddEven {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int Even_Sum = 0;
        int Odd_Sum = 0;

        do {
            System.out.print("Enter the number: ");
            number = sc.nextInt();

            if (number % 2 == 0) {
                Even_Sum += number;
            } else {
                Odd_Sum += number;
            }

            System.out.print("Do you want to continue? Press 1 for yes or 2 for not: ");
            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println("Sum of even number: " + Even_Sum);
        System.out.println("Sum of odd number: " + Odd_Sum);
        sc.close();

    }

}

