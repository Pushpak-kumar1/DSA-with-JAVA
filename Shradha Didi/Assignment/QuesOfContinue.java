package Assignment;


import java.util.*;

public class QuesOfContinue {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        for (int i = 0; i <= number; i++) {
            if(i % 10 == 0) {
                continue;
            }
            System.out.println(i);
            sc.close();
        }
    }
}
