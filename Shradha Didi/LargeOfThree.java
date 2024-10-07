
import java.util.*;

public class LargeOfThree {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        System.out.println("Enter the value of c:");
        int c = sc.nextInt();

        if ( (a >= b) && (a >= c) ) {
            System.out.println("A is Largest!");
        } else if (b >= c) {
            System.out.println("B is Largest!");
        } else {
            System.out.println("C is Largest!");
        }
            sc.close();
    }
    
}
