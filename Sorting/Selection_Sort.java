package Sorting;

public class Selection_Sort {
    public static void SelectionSort(int arr[]) {
        for (int i=0; i<arr.length-1; i++) {
            int minIndex = i;

            for (int j=i+1; j<arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;   // Index value is going
                }
            }
            //Swapping
            //swap(arr[](arr[minIndex], arr[i]));
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main (String args[]) {
        int arr[] = {5, 4, 1, 3, 2};
        SelectionSort(arr);
        printArray(arr);
    }
}
