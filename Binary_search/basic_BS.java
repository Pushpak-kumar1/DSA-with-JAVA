package Binary_search;
//import java.util.*;

public class basic_BS {
    public static int binary_Search(int arr[], int target) {
        int st = 0;
        int end = arr.length-1;

        while(st <= end) {
            int mid = st + (end - st) / 2;

            if(target == arr[mid]) return mid;
            
            if(target < arr[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {2, 4, 6, 9, 10, 13, 19, 31};
        int target = 55;

        System.out.println(binary_Search(arr, target));
    }
}
