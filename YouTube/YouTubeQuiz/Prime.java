import java.util.Scanner;

public class Prime {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Checking the number whether it is prime or not!");
        System.out.print("Please Enter a number to check:");
        int num = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
            if (count == 2) {
                System.out.println("Number is Prime");
            } else {
                System.out.println("Number is not Prime");
                sc.close();
            }

        
    }
}