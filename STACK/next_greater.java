package STACK;
import java.util.*;
// public class next_greater {
//     public static void main(String[] args) {
//         int arr[] = {1, 3, 2, 1, 8, 6, 3, 4};

//         int result[] = new int[arr.length];

//         for (int i=0; i<arr.length; i++) {
//             result[i] = -1;
//             for (int j=i+1; j<arr.length; j++) {
//                 if (arr[j] > arr[i]) {
//                     result[i] = arr[j];
//                     break;
//                 }
//             }
//         }
//         for (int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();

//         for (int i=0; i<arr.length; i++) {
//             System.out.print(result[i] + " ");
//         }
//     }
// }

// with array, the problem is Time Complexity --> O(n2)  || S.C --> O(n)
// using STACK T.C --> O(n)


public class next_greater {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 1, 8, 6, 3, 4}; 
        int size = arr.length;

        int result[] = new int[size];
        Stack<Integer> st = new Stack<>();

        result[size-1] = -1;   // last value jo bhi -1 he aaega, isme 4 ki jagah
        st.push(arr[size-1]);

        // Traverse from the second last element to the first
        for (int i = size - 2; i >= 0; i--) {
            // Pop elements from stack that are smaller than the current element
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            // If the stack is empty, there is no greater element
            if (st.isEmpty()) {
                result[i] = -1;
            } else {
                // The top of the stack is the next greater element
                result[i] = st.peek();
            }
            // Push the current element onto the stack
            st.push(arr[i]);
        }
        
        for (int i=0; i<result.length; i++) {  //            1, 3, 2, 1, 8, 6, 3, 4
            System.out.print(result[i] +" ");  // Output --> 3, 8, 8, 8, -1, -1, 4, -1
                                                //           0, 0, 0, 8, 0, 0, 4, -1
        }
    }
}