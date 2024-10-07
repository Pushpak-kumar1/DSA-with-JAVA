package Array.PW;
import java.util.*;

public class sortBySqaures {
    public static void printArray(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] sortSquares(int arr[]) {
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int k = n-1; //0;

        int ans[] = new int[n];

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k--] = arr[left] * arr[left];
                left++;
            } else {
                ans[k--] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }

    public static void main(String ags[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array : ");
            int size = sc.nextInt();

            int arr[] = new int[size];
            System.out.print("Enter the " + size + " elements : ");
            for (int i=0; i<arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int ans[] = sortSquares(arr);
            sortSquares(ans);

            printArray(ans);
        }
    }
}
