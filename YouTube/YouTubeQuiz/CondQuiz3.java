//package YouTube.YouTubeQuiz;

import java.util.Scanner;

public class CondQuiz3 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter value of b: ");
        int b = sc.nextInt();
        System.out.println("Enter the Operator (+,-,/,%,*)");
        int oprt = sc.nextInt();

        /*
         Enter 1 for +
         Enter 2 for -
         Enter 3 for *
         Enter 4 for /
         Enter 5 for %
         */

         switch (oprt) {
            case 1: System.out.println(a + b);
            break;
            case 2: System.out.println(a - b);
            break;
            case 3: System.out.println(a * b);
            break;
            case 4: if (b == 0) {
                System.out.println("Invalid number for Division!");
            } else {
                System.out.println(a / b);
            }
            break;
            case 5: if (b == 0) {
                System.out.println("Invalid number for Division!");
            } else {
                System.out.println(a % b);
            }
            break;
            default: System.out.println("Invalid Entry!");
            //break;
            sc.close();
         }
    }
    
}
