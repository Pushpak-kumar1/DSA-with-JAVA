package Patterns;

public class Alternate {

    public static void hollow_rectangle(int totrow, int totcol) {
        //outer loop
        for(int i=1; i<=totrow; i++) {
            //inner loop
            for(int j=1; j<=totcol; j++) {
                if(i == 1 || j == 1 || i == totrow || j == totcol) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pyramid(int n) {
        //outer loop
        for(int i=0; i<n; i++) {
            //inner loop
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedPyramid(int n) {
        //inner loop
        for(int i=1; i<=n; i++) {
            //loop for spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
                for(int p=1; p<=i; p++) {
                    System.out.print("*");
                }
            System.out.println();
        }
    }

    public static void ooltaPyramid(int row) {
        //inner loop
        for(int i=1; i<=row; i++) {
            //outer loop
            for(int j=1; j<=5-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void ooltaPyramid_withNumbers(int row) {
        int num = 1;
        //inner loop
        for(int i=1; i<=row; i++) {
            //outer loop
            for(int j=row; j>=i; j--) {
                System.out.print(num);
            }
            num++;
            System.out.println();
        }
    }
    public static void main(String args[]) {

        hollow_rectangle(4, 5);

        pyramid(5);

        invertedPyramid(5);

        ooltaPyramid(5);

        ooltaPyramid_withNumbers(5);
    }
}


//     public static void main (String args[]) {
//         int n = 8;

//         int n1 = (n + 1) / 2;
//         for (int i=0; i<n1; i++) {
//             for (int j=1; j<=n; j++) {
//                 System.out.print(n*(2*i)+j + " ");
//             }
//             System.out.println();
//         }
//         int n2 = n - n1;
//         for (int i=n2; i>0; i--) {
//             for (int j=1; j<=n; j++) {
//                 System.out.print(n*(2*i-1)+j + " ");
//             }
//             System.out.println();
//         }
//         System.out.println(5/2);
//     }
// }    

