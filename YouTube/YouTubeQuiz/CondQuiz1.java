
import java.util.Scanner;

public class CondQuiz1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        /*System.out.println("Enter no. upto 3: ");
        int button = sc.nextInt();

        if (button == 1) {
            System.out.println("Hello");
        } else if (button == 2) {
            System.out.println("Namaste");
        } else if (button == 3) {
            System.out.println("Bonjure");
        } else {
            System.out.println("Invalid entry!");
            sc.close();
        } */

        // With Switch Statement:

        System.out.println("Enter no. upto 3: ");
        int button = sc.nextInt();

        switch (button) {
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjure");
            break;
            default: System.out.println("Please Enter Valid no.!");
            sc.close();
        }

    }
    
}
