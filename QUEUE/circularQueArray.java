package QUEUE;
// implementing circular queue using array
public class circularQueArray {
    public static class Cqa {
        int front = -1;
        int rear = -1;
        int size = 0;

        int arr[] = new int[9];

        public void add(int value) throws Exception{
            if (size == arr.length) {
                throw new Exception("Queue is Full!");
            }
            else if (size == 0) {
                front = rear = 0;
                arr[0] = value;
            }
            else if (rear < arr.length-1) { // normal case
                arr[++rear] = value;
            }
            else if (rear == arr.length-1) {
                rear = 0;
                arr[0] = value;
            }
            size++;
        }

        public int remove() throws Exception{
            if (size == 0) {
                throw new Exception("Queue is Empty!");
            } else {
                int val = arr[front];
                if (front == arr.length-1) front = 0;
                else front++;
                size--;
                return val;
            }
        }

        public int peek() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty!");
            } else {
                return arr[front];
            }
        }

        public boolean isEmpty() {
            if (size == 0) return true;
            else return false;
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is Empty!");
                return;
            } else if (front < rear) {
                for (int i=front; i<=rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else { // rear < front
                for (int i=front; i<arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int i=0; i<=rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) throws Exception{
        Cqa cq = new Cqa();

        System.out.println(cq.isEmpty());
        cq.add(69);
        cq.add(75);
        cq.add(31);
        cq.add(23);
        cq.add(18);

        cq.display();

        System.out.println(cq.isEmpty());
        System.out.println(cq.peek());

        System.out.println(cq.remove());
        System.out.println(cq.peek());

        cq.display();

    }
}
