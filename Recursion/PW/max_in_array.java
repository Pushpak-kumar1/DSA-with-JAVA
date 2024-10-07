package Recursion.PW;
//import java.util.*;

public class max_in_array {
    public static int maxInArray(int arr[], int idx) {
        if(idx == arr.length-1) return arr[idx];

        int smallAns = maxInArray(arr, idx+1);

        return Math.max(arr[idx], smallAns);
    }
    public static void main(String args[]) {
        int arr[] = {7, 2, 0 , 15, 3, 1, 12, 6};
        int idx = 0;

        System.out.println(maxInArray(arr, idx));
    }
}
