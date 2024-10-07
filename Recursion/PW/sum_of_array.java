package Recursion.PW;
//import java.util.*;

public class sum_of_array {
    public static int sumOfArra(int arr[], int idx) {
        if(idx == arr.length-1) return arr[idx];   // if(idx == arr.length) return 0;

        //recursive work
        int smallAns = sumOfArra(arr, idx+1);

        //self work
        return smallAns + arr[idx];
    }
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        int idx = 0;

        System.out.println(sumOfArra(arr, idx));
    }
}
