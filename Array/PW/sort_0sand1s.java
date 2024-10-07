package Array.PW;
import java.util.*;

public class sort_0sand1s {
    public static void printArray(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swapInArray(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // second function
    public static void sortZerosAndOnes(int arr[]) {
        int n = arr.length;
        int count= 0;

        for (int i=0; i<n; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        for (int i=0; i<n; i++) {
            if (i < count) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    // without using 2 LOOps
    public static void ZeroAndOnes(int arr[]) {
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swapInArray(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0) {
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }
        }
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array : ");
            int size = sc.nextInt();

            int arr[] = new int[size];
            System.out.print("Enter the " + size + " elements : "); // only give 0s and 1s
            for (int i=0; i<size; i++) {
                arr[i] = sc.nextInt();
            }

            ZeroAndOnes(arr);
            printArray(arr);
        }
        
    }
}
