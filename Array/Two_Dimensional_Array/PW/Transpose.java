package Array.Two_Dimensional_Array.PW;
import java.util.*;

public class Transpose {
    public static void printMatrix(int[][] a) {
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        return;
    } 

    public static int[][] findTranspose(int matrix[][], int r, int c) {
        int ans[][] = new int[c][r];

        for (int i=0; i<c; i++) {
            for (int j =0; j<r; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of rows and columns : ");
            int r = sc.nextInt();
            int c = sc.nextInt();

            int matrix[][] = new int[r][c];
            System.out.print("Enter the matrix vlaues : ");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            System.out.println("Original Matrix");
            printMatrix(matrix);

            System.out.println();

            System.out.println("Matrix After Transpose -> ");
            int ans[][] = findTranspose(matrix, r, c);
            printMatrix(ans);
        }   
    }
}
