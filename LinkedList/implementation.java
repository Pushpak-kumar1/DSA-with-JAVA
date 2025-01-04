package LinkedList;
// hii

public class implementation {

    public static class Node {
        int data;
        Node next;

        Node(int value) {
            this.data = value;
        }
    }

    public static class linkedList {
        Node head = null;
        Node tail = null;

        // function to insert value at end
        void insertAtEnd(int value) {
            Node temp = new Node(value);       // jo bhi value mili hai uska ek newNODE bnao
            if (head == null) {
                head = temp;
                tail = temp;
            }
            else {
                tail.next = temp;
                tail = temp;
            }
        }

        // function to insert value at start
        void insetAtStart(int value) {
            Node temp = new Node(value);
            if (head == null) {    // empty list
                head = temp;
                tail = temp;
            }
            else {                 // non-empty list
                temp.next = head;
                head = temp;
            }
        }

        // function to insert at any index
        void insertAt(int idx, int value) {
            Node newNode = new Node(value);
            Node temp = head; // for traveling the nodes
            if (idx == 0) {
                insetAtStart(value);
                return;
            }
            for (int i=1; i<=idx-1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

        // function to get elements
        int getElements(int idx) {
            Node temp = head;
            for (int i=1; i<=idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        // function to delete the element using index
        void deleteAt(int idx) {
            Node temp = head;
            if (idx == 0) {
                head = head.next;
                return;
            }
            for (int i=1; i<idx-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;  // used to give the correct tail.data if idx == last idx
        }

        // function to display the linkedList
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        // Method to calculate the size of the linked list
        int getSize() {
            int count = 0;
            Node current = head;

            // Traverse the list and count the nodes
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
        }
    }
    

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        
        ll.insertAtEnd(4);
        ll.insetAtStart(5);
        ll.insertAtEnd(9);
        ll.insetAtStart(18);

        ll.insertAt(0, 76);

        ll.display();

        System.out.println();
        // System.out.print(ll.getElements(0));

        ll.deleteAt(2);
        ll.display();

        System.out.println();
        System.out.println(ll.tail.data);
    }

}
