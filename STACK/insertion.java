package STACK;
import java.util.*;

public class insertion {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);

        int idx = 2;
        int num = 10;

        Stack<Integer> temp = new Stack<>();
        while (st.size() > idx) {
            temp.push(st.pop());  // [5, 4, 3]
        }
        st.push(num);  // [1, 2, 10]

        while (temp.size() > 0) {
            st.push(temp.pop());
        }
        System.out.println(st);   // [1, 2, 10, 3, 4, 5]
    }
}
