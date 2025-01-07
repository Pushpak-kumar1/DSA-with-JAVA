package STACK;

import java.util.*;

public class balanced_bracket {
    static boolean isBalance(String str) {
        Stack<Character> st = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '(') {
                st.push(str.charAt(i));
            }
            if(str.charAt(i) == ')') {
                // First check if the stack is empty before peeking
                if (st.isEmpty()) return false;

                // Pop only if top of the stack is an opening bracket
                if(st.peek() == '(') {
                    st.pop();
                }
            }
        }
        // Stack should be empty if all brackets are balanced
        if(st.isEmpty()) {
            return true;
        }

        return false;
    }


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Please enter your input = ");
            String str = sc.nextLine();

            System.out.println(isBalance(str));
        }
    }
}
