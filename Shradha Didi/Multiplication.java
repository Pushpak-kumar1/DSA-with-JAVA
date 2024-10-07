
import java.util.Scanner;

public class Multiplication {
    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        int a = sc.nextInt();
        System.out.print("Enter the second value: ");
        int b = sc.nextInt();

        System.out.println("a * b = " + multiplication(a, b));
        System.out.println("a * b = " + multiplication(2, 4));
        sc.close();

    }
    
}
