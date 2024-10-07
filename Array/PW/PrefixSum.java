package Array.PW;
import java.util.*;

public class PrefixSum {
    public static void printArray(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] makePrixSumArray(int arr[]) {
        int n = arr.length;
        // int pref[] = new int[n];
        // pref[0] = arr[0];

        for (int i = 1; i < n; i++) { 
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array : ");
            int size = sc.nextInt();

            int arr[] = new int[size];
            System.out.print("Enter the " + size + " elements : ");
            for (int i=0; i<arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Original Array");
            printArray(arr);

            System.out.println("Array after addition");
            int pref[] = makePrixSumArray(arr);
            printArray(pref);
        }    
    }
}
