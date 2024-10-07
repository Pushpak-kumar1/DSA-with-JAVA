package Array.PW;
import java.util.*;

public class RangeQuery {
    public static void printArray(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] makePrifixSumArray(int arr[]) {
        int n = arr.length;
        //int pref[] = new int[n];
        //pref[0] = arr[0];

        for (int i = 1; i < n; i++) { 
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }
    
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array : ");
            int size = sc.nextInt();

            int arr[] = new int[size+1];
            System.out.print("Enter the " + size + " elements : ");
            for (int i=1; i<=size; i++) {
                arr[i] = sc.nextInt();
            }

            // System.out.print("Input Array");
            // printArray(arr);

            int prefixSum[] = makePrifixSumArray(arr);

            System.out.print("Enter no. of queries : ");
            int q = sc.nextInt();

            while (q-- > 0) {
                System.out.print("enter range : ");
                int l = sc.nextInt();
                int r = sc.nextInt();

                int ans = prefixSum[r] - prefixSum[l-1];
                System.out.println("Sum " + ans);
            }
        }    
    }
}
