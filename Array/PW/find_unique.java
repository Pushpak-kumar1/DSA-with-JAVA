package Array.PW;
//import java.util.*;

public class find_unique {
    public static int uniqueElement(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1; // if there is no unique element present in the array
        for (int i=0; i<n; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
            }
        }
        return ans;
    }
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4,  2, 1, 3};  // output = 4

        System.out.println(uniqueElement(arr));
    }
}
