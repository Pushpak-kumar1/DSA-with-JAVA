
package Array.PW;
//import java.util.*;

public class no_of_pairs {
    public static void printPairs(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                System.out.print("(" + arr[i] + "," + " " + arr[j] + ")");
            }
            System.out.println();
        }
    }

    // total number of pairs whose sum is equal to the given value
    public static int pairSum(int arr[], int target) {
        int n = arr.length;
        int count = 0;
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }
        }
        return count;
    }

    // total number of triplets whose sum is equal to the given value
    public static int tripletSum(int arr[], int n, int target) {
        int count = 0;
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                for (int k=j+1; k<n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target);
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        int target = 7;
        printPairs(arr);

        //System.out.println("TOTAL PAIRS: " + pairSum(arr, target));
        System.out.println(tripletSum(arr, n, target));

    }
}
