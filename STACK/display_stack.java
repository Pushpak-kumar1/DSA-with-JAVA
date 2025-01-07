package STACK;

import java.util.*;

public class display_stack {
    public static void displayRev(Stack<Integer> st) { // Display Reversed STACK Using -> iterative method
        Stack<Integer> rev_stack = new Stack<>();

        while (st.size() > 0) {
            System.out.print(st.peek() + " ");
            rev_stack.push(st.pop());
        }
        while (rev_stack.size() > 0) {
            st.push(rev_stack.pop());
        }
        System.out.println();
    }

    public static void displayRec(Stack<Integer> st) { // Display Reversed STACK using -> Recursive method
        if (st.size() == 0) return;             
        int top = st.pop();
        System.out.print(top + " ");
        displayRec(st);

        st.push(top);

    }

    public static void display(Stack<Integer> st) { // Display stack bottom to top recursively
        if (st.size() == 0) return;
        int top = st.pop();
        display(st);

        System.out.print(top + " ");
        st.push(top);
    }

    // remove from bottom / any index
    public static void removeElem(Stack<Integer> st, int idx) {
        Stack<Integer> rst = new Stack<>();

        while (st.size() > 3) {
            rst.push(st.pop());
        }
        st.pop();

        while (rst.size() > 0) {
            st.push(rst.pop());
        }
    }

    // STACK Underflow ----> empty hone k baad bhi pop krenge toh
    // STACK Overflow -----> full hone k baad bhi push krenge toh --> actual computer ki memory full ho gyi 
                                                            // --> agr khud ka stack implm. krte hai tab size fix rehta hai

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        // System.out.println(st); // --- built in function hai ye toh

        // without built-in function
        Stack<Integer> newst = new Stack<>();
        while (st.size() > 0) {
            newst.push(st.pop());
        }
        while (newst.size() > 0) {
            int x = newst.pop();
            System.out.print(x + " ");
            st.push(x);
        }
        System.out.println();
        System.out.println(st);

        // another method using array
        System.out.println("another method: ");
        int n = st.size();
        int arr[] = new int[n];

        for (int i=n-1; i>=0; i--) {
            arr[i] = st.pop(); // [5, 4, 3, 2, 1]
        }
        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " "); // [1, 2, 3, 4, 5]
            st.push(arr[i]);
        }
        System.out.println();

        System.out.print("function to print in reverse order: ");
        System.out.println();
        displayRev(st);

        System.out.print("reversed stack using recursion: ");
        displayRec(st);
        System.out.println();

        System.out.print("Stack bottom to top: ");
        display(st);
        System.out.println();
        
        System.out.print("stack with removed element: ");
        removeElem(st, 3);
        System.out.print(st + " ");

    }
}
