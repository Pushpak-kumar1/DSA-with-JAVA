
// //import java.util.Scanner;

// public class WhileLoop {
    
//     public static void main (String args[]) {

//         int i = 1;
//         while (i <= 10) {
//             System.out.println(i + " ");
//             i++;
//         }
//     }
// }


import java.util.*;

public class WhileLoop {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        int range = sc.nextInt();
        int counter = 1;

        while(counter <= range) {
            System.out.println(counter + " ");
            counter++;
        }
        System.out.println();
        sc.close();
    }
}
