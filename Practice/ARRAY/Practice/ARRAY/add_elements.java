package Practice.ARRAY;

import java.util.*;

public class add_elements {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int myArray[] = new int[size];
        int sum = 0;
        System.out.print("Enter the elements of the array: ");
        for (int i=0; i<size; i++) {
            myArray[i] = sc.nextInt();
            sum = sum + myArray[i];
        }

        System.out.println("size of the array is = " + size);
        System.out.println("sum of the elements of the array = " + sum);
        sc.close();
    }
}