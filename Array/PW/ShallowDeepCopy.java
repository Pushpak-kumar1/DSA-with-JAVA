package Array.PW;
//import java.util.*;

public class ShallowDeepCopy {
    public static void printArray(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6};

        System.out.print("Original array : ");
        printArray(arr);

        int arr_2[] = arr.clone(); 
        System.out.print("coppied array : ");
        printArray(arr_2);

        arr_2[0] = 10;
        arr_2[1] = 20;

        System.out.print("Original array after changing in arr_2 : ");
        printArray(arr);

        System.out.print("coppied array after changing in arr_2 : ");
        printArray(arr_2);
    }
}
