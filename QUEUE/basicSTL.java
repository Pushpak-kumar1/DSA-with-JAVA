
package QUEUE;

import java.util.*;

public class basicSTL {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q.size());
        System.out.println(q + " ");

        q.remove();  // q.poll() bhi use krte hai delete krne k liye
        System.out.println(q + " ");

        System.out.println(q.peek()); // q.element se sbse aage wala element print hoga
        System.out.println("size of queue: " + q.size());

        System.out.println(q.isEmpty());
    }
}

// q.size and q.isEmpty === auxillary operations
