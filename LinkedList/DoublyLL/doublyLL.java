package LinkedList.DoublyLL;

import STACK.insertion;

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
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    // function to print LL in reverse order
    public static void displayReverse(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + "->");
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

    // insertion at head
    public static Node insertAtStart(Node head, int value) {
        Node newNode = new Node(value);

        newNode.next = head;
        newNode.prev = null;
        head = newNode;
        return head;
    }

    // insertion at Tail
    public static Node insertAtEnd(Node tail, int value) {
        Node newNode = new Node(value);

        tail.next = newNode;
        newNode.next = null;
        newNode.prev = tail;
        tail = newNode;
        return tail;
    }

    // insert at any index in DLL
    public static void insertAtAnyIdx(Node head, int idx, int value) {
        Node newNode = new Node(value);
        Node temp = head;

        if (idx == 0) {
            insertAtStart(head, value);
        }
        for (int i = 1; i < idx; i++) {
            if (temp == null) {
                System.out.print("Index out of bounds.");
                return; // Exit if index is invalid
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Index out of bounds.");
            return; // Exit if temp is null
        }
        newNode.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        newNode.prev = temp;
        temp.next = newNode;

        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data + "->");
            tempNode = tempNode.next;
        }
        System.out.println();
    }

    // delete head Node
    public static void deleteHead(Node head) {
        head = head.next;
        head.prev = null;

        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data + "->");
            tempNode = tempNode.next;
        }
    }

    // delete last node when only head is given
    public static Node deleteEndNode(Node head) {
        Node tempNode = head;

        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }

        tempNode.prev.next = null;
        return head;
    }

    // delete last node when tail is given
    public static Node removeEndNode(Node tail) {
        tail.prev.next = null;
        tail = tail.prev;

        return tail;
    }


    // two sum in a doubly linkedList
    public static void towSumDLL(Node head, Node tail, int target) {
        while (head.data < tail.data) {
            if (head.data + tail.data == target) {
                System.out.print("First Node: " + head.data + "Second Node: " + tail.data);
                break;
            }
            else if (head.data + tail.data > target) {
                tail = tail.prev;
            }
            else /*(head.data + tail.data < target)*/ {
                head = head.next;
            }
        }
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

        Node newHead = insertAtStart(a, 39);
        displayAll(newHead);

        Node newTail = insertAtEnd(e, 69);
        displayReverse(newTail);

        insertAtAnyIdx(a, 3, 88);

        // deleteHead(a);

        Node deletedNode = deleteEndNode(a);
        // displayAll(deletedNode);

        // removeEndNode(newTail);
        // displayAll(a);

        towSumDLL(a, e, 15);

    }
}
