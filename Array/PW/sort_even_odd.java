package Array.PW;
import java.util.*;

public class sort_even_odd {
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

    public static void sortArrayByParity(int arr[]) {
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                swapInArray(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 == 1) {
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

            sortArrayByParity(arr);
            printArray(arr);
        }
    }
}
