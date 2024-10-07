import java.util.*;

public class fibonacci {
    public void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of terms: ");
        int num = sc.nextInt();

        int n1=0, n2=1;
        System.out.print(n1 + n2);

        for(int i=0; i<=num; i++) {
            int n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
        sc.close();
    }
}
