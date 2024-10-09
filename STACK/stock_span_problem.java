package STACK;

import java.util.*;

public class stock_span_problem {
    public static void main(String[] args) {
        int arr[] = {100, 80, 60, 70, 60, 75, 85}; 
        int size = arr.length;

        int result[] = new int[size];
        Stack<Integer> st = new Stack<>();

        result[0] = 1;  
        st.push(0);

        // Traverse from the second last element to the first
        for (int i = 1; i < size; i++) {
            // Pop elements from stack that are smaller than the current element
            while (!st.isEmpty() &&  arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                result[i] = 1;
            } else {
                result[i] = i-st.peek();
            }
            // Push the current element onto the stack
            st.push(i);
        }
        
        for (int i=0; i<result.length; i++) { 
            System.out.print(result[i] +" "); 
        }    
    }
}
