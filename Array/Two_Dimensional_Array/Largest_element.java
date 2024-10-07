package Array.Two_Dimensional_Array;

import java.util.*;

public class Largest_element {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 10 integers: ");
        int matrix[][] = new int[2][5];

        for (int i=0; i<matrix.length; i++) {
            int max = matrix[i][0];

            for (int j=0; j<matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();

                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
            System.out.print("Maximum value of this matrix is: " + max);
        }
        System.out.println();
        sc.close();
    }
}