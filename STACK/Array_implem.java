package STACK;

public class Array_implem {
// ADVANTAGES as compared to LInkedList:
    // 1. Size -> for every elements space taken in block || IN LL one is data and one is address.
    // 2. if we the size already 
//  DISADVATAGES:
    // 1.fixed size()   2.if we define 100 size then use one few of it
    public static class Stack {

        int arr[] = new int[10];
        int idx = 0;

        void push(int value) {
            if (isFull()) {
                System.out.println("STACK is full!");
                return;
            }
            arr[idx++] = value;
        }

        void display() {
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");
            } 
            System.out.println();
        }

        int pop() {
            if (idx == 0) {
                System.out.print("Stack is empty!");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }

        int size() {
            return idx;
        }

        int peek() {
            if (idx == 0) {
                System.out.print("Stack is empty!");
                return -1;
            }
            return arr[idx-1];
        }

        boolean isEmpty() {
            if (idx == 0) return true;
            return false;

        }

        boolean isFull() {
            if (idx == this.arr.length) return true;
            return false;

        }

        int capacity() { 
            return this.arr.length;
        }
    }


    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(69);
        st.push(5);
        st.push(5);
        st.push(5);
        st.push(5);
        st.push(5);
        st.display(); // 1 2 3 4  5 

        System.out.print("Size of the Stack: " + st.size());
        System.out.println();

        st.pop();
        st.display(); // 1 2 3 4

        System.out.print("Peek element is: " + st.peek());
        System.out.println();

        System.out.print("Max Capacity of the stack is: " + st.capacity());
        System.out.println();

        System.out.println(st.isEmpty());

        System.out.println(st.isFull());
    }
}
