
//Write a function that takes in age as input and returns it that person in eligible to vote or not.

import java.util.Scanner;

public class EligibleAge {

    public static void eligibleAge (int age) {
        if (age >= 18) {
            System.out.println("You can vote!");
        } else{
            System.out.println("You can't vote!");
        }
        //return;

    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter You Age: ");
        int age = sc.nextInt();

        eligibleAge(age);
        sc.close();
    }
    
}
