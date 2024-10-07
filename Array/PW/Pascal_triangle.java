package Array.PW;
//import java.util.*;
public class Pascal_triangle {
    public static void printMatrix(int[][] matrix) {
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int[][] pascalTriangle(int n) {
        int ans[][] = new int[n][];
        
        for (int i=0; i<n; i++) {
            // ith row has i+1 coloumn
            ans[i] = new int[i+1];
            // first ans last coloumn has 1 value
            ans[i][0] = ans[i][i] = 1;

            for (int j=1; j<i; j++) {
                ans[i][j] = ans[i-1][j-1] + ans[i-1][j];
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        int n = 5;

        int ans[][] = pascalTriangle(n);
        printMatrix(ans);


    }
}
