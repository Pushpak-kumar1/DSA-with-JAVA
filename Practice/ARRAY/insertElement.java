import java.util.*;

public class insertElement {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int size = sc.nextInt();

        int a[] = new int[size + 1];
        System.out.print("Enter Array Element: ");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        int loc;
        System.out.print("Enter Array location: ");
        loc = sc.nextInt();
        System.out.print("Enter new item: ");
        int item = sc.nextInt();

        for (int i=size; i>loc; i--) {
            a[i] = a[i-1];
        }
        a[loc] = item;
        size++;
        for (int i=0; i<size; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}