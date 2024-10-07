import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the amount of Your INCOME!:");
        int income = sc.nextInt();

        int tax = 0;

        if (income < 500000) {
            System.out.println("You have to give no tax!");
        } else if (income >= 500000 && income < 1000000) {
            System.out.println("You have to give 20% tax");
            tax = income / 100 * 20;
            System.out.println("Your amount is:" + tax);
        }else if (income > 1000000) {
            System.out.println("You have to give 30% tax");
            tax = income / 100 * 30;
            System.out.println("Your amount is: " + tax);
        } else {
            System.out.println("Please Check Your Amount!");
            sc.close();
        }

    }
}
