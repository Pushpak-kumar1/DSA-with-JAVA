import java.util.Scanner;

public class prime_no {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        
        int count = 0;
        for(int i=1; i<=num; i++) {
            if(num % i == 0) {
                count++;
            }
        }    
            if(count == 2) {
                System.out.print("This number is prime");
            } else {
                System.out.print("This number is not prime");
                sc.close();
            }
        } 
    }