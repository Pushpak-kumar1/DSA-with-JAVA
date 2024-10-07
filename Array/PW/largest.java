package Array.PW;

public class largest {
    public static int findMax(int arr[]) {
        int max = Integer.MIN_VALUE; // -infinity
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // find the second largest in the array
    public static int findSecondMax(int arr[]) {
        int max = findMax(arr);
        int n = arr.length;
        for (int i=0; i<n; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        } 
        int secondMax = findMax(arr);
        return secondMax;
    }
    public static void main(String args[]) {
        int arr[] = {-1, -2, -3, -4, -5};

        System.out.println(findMax(arr));
        System.out.println(findSecondMax(arr));

    }
}
