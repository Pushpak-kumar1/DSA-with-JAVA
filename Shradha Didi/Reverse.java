
public class Reverse {
    public static void main (String args[]) {

        int n = 2345;
        
        // while (n > 0) {
        // int lastdigit = n % 10;
        // System.out.print(lastdigit);
        // n /= 10;
        
        // }

        int rev = 0;
        int rem = 1;

        while (n > 0) {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n /= 10;
        }
        System.out.println(rev);
    }
}
