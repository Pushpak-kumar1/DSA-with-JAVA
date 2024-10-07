package Array.Two_Dimensional_Array.PW;
import java.util.*;

public class Sum_of_2D {
    public static void printMatrix(int[][] a) {
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        return;
    } 
    
    public static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.print("Wrong Input - Addition not possible");
            return;
        }
        int sum[][] = new int[r1][c1];

        for (int i=0; i<r1; i++) {
            for (int j=0; j<c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        printMatrix(sum);
    }

    public static void multiply(int a[][], int r1, int c1, int b[][], int r2, int c2) {
        if (r2 != c1) {
            System.out.print("Multiply can't be performed on this matrix!");
            return;
        }

        int mul[][] = new int[r1][c2];

        for (int i=0; i<r1; i++) {
            for (int j=0; j<c2; j++) {
                for (int k=0; k<c1; k++) {
                    mul[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        System.out.println("MUltiplication of two matrices: ");
        printMatrix(mul);
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of rows and columns : ");
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();

            int a[][] = new int[r1][c1];
            System.out.print("Enter the matrix vlaues : ");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            System.out.print("Enter the number of rows and columns : ");
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();

            int b[][] = new int[r2][c2];
            System.out.print("Enter the matrix vlaues : ");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    b[i][j] = sc.nextInt();
                }
            }

            System.out.println("Matrix 1");
            printMatrix(a);
            System.out.println("Matrix 2");
            printMatrix(b);

            //System.out.println("Sum of these array is : ");
            //add(a, r1, c1, b, r2, c2);

            multiply(a, r1, c1, b, r2, c2);
        }
    }
}
