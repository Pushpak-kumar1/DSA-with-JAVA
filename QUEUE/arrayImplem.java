package QUEUE;

public class arrayImplem {
    public static class queueA {
        int f = -1;
        int r = -1;
        int size = 0;
        int arr[] = new int[6]; 
        
        // function is add elements
        public void add(int value) {
            if (r == arr.length-1) {
                System.out.println("Queue is full!");
                return;
            }
            if (f == -1) {
                f = r = 0;
                arr[r] = value;
            } else {
                arr[r+1] = value;
                r++;
            }
            size++;
        }

        // function to remove elements
        public int remove() {
            if (size == 0) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            int x = arr[f];
            f++;
            size--;
            return x;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            return arr[f];
        }

        public boolean isEmpty() {
            if (size == 0) return true;
            else return false;
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is Emtpy!");
            } else {
                for (int i=f; i<=r; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        queueA q = new queueA();

        q.display();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q.size);
        q.display();

        System.out.println(q.remove());
        q.display();
        System.out.println(q.remove());
        q.display();

        System.out.println(q.isEmpty());
        System.out.println(q.peek());
    }
}