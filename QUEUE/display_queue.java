package QUEUE;

import java.util.*;

public class display_queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        // print elements withOut using built-in function
        Queue<Integer> newQ = new LinkedList<>();

        while (q.size() > 0) {
            System.out.print(q.peek() + " ");
            newQ.add(q.remove());
        }
        System.out.println();

        while (newQ.size() > 0) {
            int x = newQ.remove();
            q.add(x);
        }

        System.out.println(q);
        System.out.println(newQ);
    }
}
