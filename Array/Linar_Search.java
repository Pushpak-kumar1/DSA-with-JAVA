package Array;

public class Linar_Search {
    public static int linearSearch(int number[], int key) {
        for (int i=0; i<number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;   //this means that number doesn't exists!
    }

    public static void main (String args[]) {
        int number[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 16;  // the number we have to find in the upper array!

        int index = linearSearch(number, key);
            if (index == -1) {
                System.out.println("Not Found!");
            } else {
                System.out.println("key is at index: " + index);
            }
    }
}
