package STACK;

public class LinkedList_implem {
// ADVANTAGES:
    // 1. unlimited size
// DISADVANTAGES:
    // 1. Two data members
    // 2. if we want to print then we have to do it in reverse --> increases the T.C && S.C
    public static class Node {
        int data;
        Node next;

        Node(int value) {
            this.data = value;
            this.next = null;
        }
    }

    public static class Stack {
        Node head = null;
        int size = 0;

        void push(int value) {
            Node temp = new Node(value);
                temp.next = head;
                head = temp;
                size++;
        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1; // or throw an exception
            }
            int popValue = head.data;
            head = head.next;
            size--;
            return popValue;
        }

        int peek() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1; // or throw an exception
            }
            return head.data;
        }

        // Method to check if the stack is empty
        boolean isEmpty() {
            return head == null;
        }

        // Method to get the size of the stack
        int getSize() {
            return size;
        }

        void display() {
            if (size == 0) {
                System.out.print("Stack is empty!");
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
       Stack st = new Stack();

       st.push(1);
       st.push(2);
       st.push(3);
       st.push(4);
       st.push(5);
       st.push(9);

       st.display();

       System.out.print(st.peek());
       System.out.println();

       System.out.print(st.pop());
       System.out.println();

       st.display();

    }
}
