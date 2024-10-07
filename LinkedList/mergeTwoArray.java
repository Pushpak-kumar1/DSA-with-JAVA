
package LinkedList;

import java.util.Arrays;

public class mergeTwoArray {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        // Create a new result array to store the merged result
        int[] result = new int[m + n];
        int i = 0, j = 0, k = 0;

        // Merge the two arrays
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                result[k++] = nums1[i++];       
            } else {
                result[k++] = nums2[j++];
            }
        }

        // Copy remaining elements of nums1[] if any
        while (i < m) {
            result[k++] = nums1[i++];
        }

        // Copy remaining elements of nums2[] if any
        while (j < n) {
            result[k++] = nums2[j++];
        }

        // Copy the result array back to nums1
        for (int p = 0; p < m + n; p++) {
            nums1[p] = result[p];
        }

        return nums1; // Optionally return nums1, though in-place modification is usually expected.
    }

    public static void main(String args[]) {
        int nums1[] = {1, 2, 3, 0, 0, 0, 0, 0};
        int nums2[] = {2, 4, 6, 8, 10};

        int m = 3;
        int n = 5;

        int[] mergedArray = merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(mergedArray));
    }
}