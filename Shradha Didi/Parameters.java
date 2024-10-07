import java.util.Scanner;

public class Parameters {

    public static int calculateSum(int num1, int num2) {   // num1 and num2 are Parameters ya formal Paramet
        int sum = num1 + num2;
      //System.out.println("Sum is: " + sum);
        return sum;
       
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("sum is: " + calculateSum(a, b));  // arguements or actual parameters
        sc.close();
        
    }
}
