package Array.PW;
import java.util.*;

public class rotate_array {
    public static void printArray(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int arr[], int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        // System.out.println(a);
        // System.out.println(b);
    }

    // SWAP IN ARRAY
    public static void swapInArray(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // reverse a given array
    public static void reverseArray(int arr[]) {
       // int n = arr.length;
       // int ans[] = new int[n];
        // for (int i=n-1; i>=0; i--) {
        //     ans[j++] = arr[i];
        // }

        int i = 0, j = arr.length-1;
        while (i >= 0) {
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }

    // reverse a given array with making extra array
    public static void revers(int arr[], int i, int j) {
        while (i < j) {
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }

    //rotate the given array by k steps
    public static int[] rotate(int arr[], int k) {
        int n = arr.length;
        int j = 0;
        k = k % n;

        int ans[] = new int[n];
        for (int i=n-k; i<=n-1; i++) {
            ans[j++] = arr[i];
        }
        for (int i=0; i<=n-k-1; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }
    
    // rotate array without using 2 for loops
    public static void rotateInPlace(int arr[], int k) {
        int n = arr.length;
        k = k % n;

        revers(arr, 0, n-k-1);
        revers(arr, n-k, n-1);
        revers(arr, 0, n-1);
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array : ");
            int size = sc.nextInt();

            System.out.print("Enter the " + size + " elements : ");
            int arr[] = new int[size];
            for (int i=0; i<size; i++) {
                arr[i] = sc.nextInt();
            }

      // int ans[] = reverseArray(arr);
            
            rotateInPlace(arr, 101);
            printArray(arr);
        }

        //int a = 10;
        //int b = 20;
        //swap(a, b);


    }
}
