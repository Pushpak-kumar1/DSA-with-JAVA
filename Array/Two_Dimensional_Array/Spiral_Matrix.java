package Array.Two_Dimensional_Array;

import java.util.*;

public class Spiral_Matrix {
    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow   = matrix.length - 1;
        int endCol   = matrix[0].length - 1;

        while(startRow <= endRow && endCol <= endRow) {

            //top boundary
            for (int j=startCol; j<=endCol; j++) {
                System.out.print(matrix[startRow][j] + "  ");
            }

            //right boundary
            for (int i=startRow+1; i<=endRow; i++) {
                System.out.print(matrix[i][endCol] + "  ");
            }

            //bottom boundary
            for (int j=endCol-1; j>=startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + "  ");
            }

            //left boundary
            for (int i=endRow-1; i>=startRow+1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + "  ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    /**
     * @param args
     */
    public static void main (String args[]) {
        // int matrix[][] = { {1, 2, 3},
        //                    {4, 5, 6},
        //                    {7, 8, 9}};

        Scanner sc = new Scanner(System.in);
        int martix[][] = new int[3][3];
        int n=3, m=3;
        
        System.out.println("Enter the elements of the matrix: ");
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                martix[i][j] = sc.nextInt();
            }
        }
        printSpiral(martix);
        sc.close();
    }
} 