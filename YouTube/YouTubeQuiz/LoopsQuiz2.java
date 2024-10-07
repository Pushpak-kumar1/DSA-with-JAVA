/*  package YouTube.YouTubeQuiz; */

import java.util.*;

public class LoopsQuiz2 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. for which you want the table:");
        int num = sc.nextInt();

        System.out.println("Table of this number is:");

        int table = 0;
        for (int i = 1; i <= 10; i++) {
            table = num * i;
        System.out.println(table);
        sc.close();
        }
    }
    
}
