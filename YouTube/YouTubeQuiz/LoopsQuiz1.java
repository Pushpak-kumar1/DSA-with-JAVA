
import java.util.Scanner;

public class LoopsQuiz1 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int number = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        
        System.out.println("Sum is: " + sum);
        sc.close();

    }
    
}
