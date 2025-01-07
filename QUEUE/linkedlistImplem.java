
// ADVANTAGES: 1. unlimited size (2). this works like linkedlist
// DISADVANTAGES: (1). LL has two members data & address.. 

package QUEUE;

public class linkedlistImplem {
    public static class Node {  // user defined data type
        int data;
        Node next;

        Node(int value) {  // constructor
            this.data = value;
            this.next = null;
        }
    }

    public static class queue { // user defined data structure
        Node head = null;
        Node tail = null;
        int size = 0;

        // add element function
        void add(int value) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }

        int remove() {
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

        void printQueue() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        queue q = new queue();

        System.out.println(q.isEmpty());
        q.add(10);
        q.add(20);
        q.add(69);
        q.add(30);

        q.printQueue(); // To verify the queue content

        q.remove();
        q.printQueue();

        System.out.println(q.peek());
        System.out.println(q.isEmpty());

        System.out.println(q.getSize());
    }
}
