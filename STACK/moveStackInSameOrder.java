package STACK;

import java.util.*;

public class moveStackInSameOrder {
    public static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);

        // In reverse order
        Stack<Integer> st2 = new Stack<>();
        // st2.push(st.pop());
        // st2.push(st.pop());
        // st2.push(st.pop());
        // st2.push(st.pop());
        // st2.push(st.pop());

        while (st.size() > 0) {  // another method
            st2.push(st.pop());
        }

        System.out.println(st2);

        // third stack----------------------------------------
        Stack<Integer> st3 = new Stack<>();
        while (st2.size() > 0) {
            st3.push(st2.pop());
        }
        System.out.print(st3);
        // System.out.print(st);      // khali ho gya 
        // System.out.print(st2);     // khali ho gya 
    }
}
