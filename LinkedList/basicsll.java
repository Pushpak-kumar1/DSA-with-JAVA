package LinkedList;

public class basicsll {
    public static class Node {
        int data;
        Node next;  // next is a property --> addr. of next node

        Node(int value) {
            this.data = value;
        }
    }
        
    // function to insert at end
    public static void insertAtEnd(Node head, int value) {
        Node temp = new Node(value);
        Node t = head;
        while (t.next != null) {
            t= t.next;
        }
        t.next = temp;
    }

    // function to print the linkedList && find the length of LL
    public static void displayLL(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
    }

    // display the linkedList recursively
    public static void displayRec(Node head) {
        if (head == null) return;
        displayRec(head.next);
        System.out.print(head.data + "->");
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(4);   // pros --> insertion
        Node c = new Node(9);   // cons --> traversal
        Node d = new Node(2);
        Node e = new Node(7);  
        // 5 4 9 2 7
        a.next = b;   // 5->4 9 2 7
        b.next = c;   // 5->4->9 2 7
        c.next = d;   // 5->4->9->2 7
        d.next = e;   // 5->4->9->2->7
        e.next = null;

        // Node temp = a;  // temp is pointing on 'a'
        // for (int i=1; i<=5; i++) {
        //     System.out.print(temp.data + " -> ");
        //     temp = temp.next;
        // }

        // function to inset at end
        insertAtEnd(a,100);

        displayLL(a);
        displayRec(a);
    }
}
