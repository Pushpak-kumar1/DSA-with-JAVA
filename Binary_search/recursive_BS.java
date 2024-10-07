package Binary_search;

public class recursive_BS {
    public static boolean recBinarySearch(int arr[], int st, int end, int target) {
        if (st > end) return false;
        int mid = st + (end - st) / 2;

        if (target == mid) {
            return true;
        } else if (target < arr[mid]) {
            return recBinarySearch(arr, st, mid-1, target);
        } else {
            return recBinarySearch(arr, mid+1, end, target);
        }
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int st = 0;
        int end = arr.length-1;
        int target = 71;

        System.out.println(recBinarySearch(arr, st, end, target));
    }
}
