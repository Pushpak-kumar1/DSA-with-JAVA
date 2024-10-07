
package LinkedList;

public class nthNodeFromEnd {

  public static class Node {
    int data;
    Node next; // next is a property --> addr. of next node

    Node(int value) {
      this.data = value;
    }
  }

  // 1st method -> in this way, two traversal is required
  public static Node nthNode(Node head, int n) {
    int size = 0;
    Node temp = head;
    while (temp != null) {
      size++;
      temp = temp.next;
    }

    int m = size - n + 1;
    // mth node from start
    temp = head;
    for (int i=1; i<=m-1; i++) {
      temp = temp.next;
    }
    return temp;
  }

  // 2nd method in which we use only 1 traversal but Time Com will be O(n)
  public static Node nthNode2(Node head, int n) {
    Node slow = head;
    Node fast = head;

    for (int i=1; i<=n; i++) {
      fast = fast.next;
    }

    while (fast != null) {
      fast = fast.next;
      slow = slow.next;
    }
    return slow;
  }

  // deleting a node from the nth end
  public static Node deleteNthFromEnd(Node head, int n) {
    Node slow = head;
    Node fast = head;

    for (int i=1; i<=n; i++) {  // jitna no. diya hai utne steps pehle he aage badh gye
      fast = fast.next;
    }
    if (fast == null) {
      head = head.next;
      return head;
    }
    while (fast.next != null) {
      slow = slow.next;
      fast = fast.next;
    }
    slow.next = slow.next.next;
    return head;
  }

  // function to print the linkedList 
  public static void displayLL(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Node a = new Node(5);
    Node b = new Node(4); // pros --> insertion
    Node c = new Node(9); // cons --> traversal
    Node d = new Node(2);
    Node e = new Node(7);
    // 5 4 9 2 7
    a.next = b; // 5->4 
    b.next = c; // 5->4->9 
    c.next = d; // 5->4->9->2 
    d.next = e; // 5->4->9->2->7
    e.next = null;

    displayLL(a);

    Node q = nthNode(a, 2);
    System.out.println(q.data);

    a = deleteNthFromEnd(a, 5);
    displayLL(a);

  }
}