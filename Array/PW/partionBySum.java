package Array.PW;

public class partionBySum {
    public static int findArraySum(int arr[]) {
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static boolean equalSumPartition(int arr[]) {
        int totalSum = findArraySum(arr);

        int prefSum = 0;
        for (int i=0; i<arr.length; i++) {
            prefSum += arr[i];
            int suffixSum = totalSum - prefSum;
            if (suffixSum == prefSum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 3, 4, 5};

        System.out.println(equalSumPartition(arr));

    }
}
