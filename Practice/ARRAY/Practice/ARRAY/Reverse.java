package Practice.ARRAY;

public class Reverse {
    public static  void reverseArray(int matrix1[], int matrix2[]) {
        for (int i=0; i<=matrix1.length-1; i++) {
            for (int j=matrix1.length-1; j>=0; j--) {
            matrix2[j] = matrix1[i];
            }
        }
    }

    public static void main (String args[]) {
        int matrix1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int matrix2[] = new int[15];

        reverseArray(matrix1, matrix2);

        for (int i=0; i<matrix2.length; i++) {
            System.out.println(matrix2[i] + " ");
        }
    }
}
