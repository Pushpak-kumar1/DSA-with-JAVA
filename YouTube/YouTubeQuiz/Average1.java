import java.util.Scanner;

public class Average1 {
    public static int average(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        System.out.println("Average is: " + average(a, b, c));
        sc.close();

    }
}