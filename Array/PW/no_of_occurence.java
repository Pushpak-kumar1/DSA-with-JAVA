// Count the number of occurences of a particular element X

package Array.PW;
import java.util.*;

//import Array.STRINGS.largeString;

public class no_of_occurence {
    public static void printArray(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int Occurences(int arr[], int target) {
        int count = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void lastOccurence(int arr[], int target) {
        int lastIndex = -1; // -1 is for situation when target doesn't exists
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == target) {
                lastIndex = i;
            }
        }
        System.out.println("last Occurence of " + target + " is " + lastIndex);
    }

    // count the no. of elemnents which are strictly greater than target
    public static int Occurence2(int arr[], int target) {
        int count = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > target) {
                count++;
            }
        }
        return count;
    }

    // Check whether the given array is Sorted or not
    public static boolean sorted(int arr[]) {
        boolean flag = true;
        for (int i=1; i<arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                //not sorted
                flag = false;
                break;
            }
        }
        return flag;
    }

    // Kth smallest and largest number
    public static int[] kthsmallestAndLargest(int arr[], int k) {
        Arrays.sort(arr);
        int ans[] = {arr[k-1], arr[arr.length-k]};

        return ans;
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of the array : ");
            int n = sc.nextInt();

            int arr[] = new int[n];

            System.out.print("Enter the elemets of the array: ");
            for (int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }

      // System.out.print("Enter the target : ");
      // int target = sc.nextInt();

     // int result = Occurences(arr, target);
     // System.out.println("Occurence of " + target  + " is "  + result);

     //lastOccurence(arr, target);

      // System.out.println(Occurence2(arr, target));

      //System.out.println(sorted(arr));

      int k = 3;
      int ans[] = kthsmallestAndLargest(arr, k);
      System.out.println(ans[0]);
      System.out.println(ans[1]);
        }
    }
}
