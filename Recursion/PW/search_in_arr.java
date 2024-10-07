
package Recursion.PW;
//import java.util.*;

public class search_in_arr {
    public static boolean searchInArray(int arr[], int n, int target, int idx) {
        // base case
        if(idx == n) return false;

        // self work
        if(arr[idx] == target) return true;

        // recursive work
        if(searchInArray(arr, n, target, idx+1) == true) {
            return true;
        } else {
            return false;
        }
    }

    public static int findIndex(int arr[], int n, int target, int idx) {
        if(idx == n) return -1;

        if(arr[idx] == target) return idx;

        return findIndex(arr, n, target, idx+1);
    }

    public static void findAllIndex(int arr[], int n, int target, int idx) {
        if(idx >= n) return;

        if(arr[idx] == target) System.out.print(idx + " ");

        findAllIndex(arr, n, target, idx+1);
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 4, 7, 4};
        int target = 4;
        int n = arr.length;
        int idx = 0;

        if(searchInArray(arr, n, target, idx) == true) {
            System.out.println("Yes this element is present");
        } else {
            System.out.println("NO this element is not present");
        }

        System.out.println(findIndex(arr, n, target, idx));
        findAllIndex(arr, n, target, idx);
    }
}
