import java.util.Scanner;

public class Product {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();

        int product = a * b; // Formula to Calculate the multiplication of two numbers

        System.out.println("Product of a and b is: " + product);
        sc.close();
        
    }
    
}
