
public class FuncPrime {

    //only for n>=2
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        //corner case
        //2
        if(n == 2) {
            return true;
        }

        for (int i=2; i<=n-1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return isPrime; 
    }

    public static void primeInRange(int n) {
        for (int i=2; i<=n-1; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main (String args[]) {

        primeInRange(20);
        //System.out.println(isPrime(5));
    }
    
}
