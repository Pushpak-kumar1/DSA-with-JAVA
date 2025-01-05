package LinkedList.DoublyLL;

public class doublyLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node (int value) {
            this.data = value;
        }
    }

    // function to print LinkedList
    public static void displayAll(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // function to print LL in reverse order
    public static void displayReverse(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.prev;
        }
        System.out.println(); 
    }

    // print the LL from any Node 
    public static void displayfromAnyNode(Node random) {
        Node temp = random;
        // move this temp backwards to the head
        while (temp.prev != null) {
            temp = temp.prev;
        }
        // now print the list in forward order
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // print the LL from any Node but in reverse order
    public static void displayfromAnyNode2(Node random) {
        Node temp = random;
        // move this temp backwards to the head
        while (temp.next != null) {
            temp = temp.next;
        }
        // now print the list in forward order
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        // 4 -> 10 -> 2 -> 99 -> 13
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);

        a.prev = null;
        a.next = b;

        b.prev = a;
        b.next = c;

        c.prev = b;
        c.next = d;

        d.prev = c;
        d.next = e;

        e.prev = d;
        e.next = null;

        displayAll(a);
        displayReverse(e);
        displayfromAnyNode(c);
        displayfromAnyNode2(c);

    }
}
