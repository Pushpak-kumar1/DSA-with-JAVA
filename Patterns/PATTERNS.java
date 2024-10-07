package Patterns;

public class PATTERNS {

    public static void hollow_rectangle(int totRows, int totCols) {
         //outer loop
         for (int i=1; i<=totRows; i++) {
            // inner loop
            for (int j=1; j<=totCols; j++) {
                // for cell
                if (i == 1 || j == 1 || i == totRows || j == totCols) {
                    //boundary cells
                    System.out.print("*");
                } else {
                    //empty cells
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_halfPyramid(int n) {
        //outer loop
        for (int i=1; i<=n; i++) {
            //inner loop
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int p=1; p<=i; p++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_half_pyramidWithNumbers(int rows) {
        //outer loop
        for (int i=1; i<=rows; i++) {
            //inner loop 
            for (int j=1; j<=rows-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void floyds_triangle(int rows) {
        int number = 1;
        //outer loop
        for (int i=1; i<=rows; i++) {
            //inner loop 
            for (int j=1; j<=i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int rows) {
        //outer loop
        for (int i=1; i<=rows; i++) {
            //inner loop
            for (int j=1; j<=i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void solid_rhombus(int n) {
        //outer loop
        for (int i=1; i<=n; i++) {
            //inner loop for spaces
            for (int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            //inner loop to print stars
            for (int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void butterFly(int n) {
        /*(First Half) upper part of the pattern */ 

        for (int i=1; i<=n; i++) {
            // print star
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }

            // print spaces
            for (int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }

            // print stars again                                
            for (int j=1; j<=i; j++) {                                                                                      
                System.out.print("*");
            }
            System.out.println();
        }

        /*Second half lower part of the pattern */

        for (int i=n; i>=1; i--) {
             // print star
             for (int j=1; j<=i; j++) {
                System.out.print("*");
            }

            // print spaces
            for (int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }

            // print stars again
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    public static void hollow_solid_rhombus(int n, int m) {
        //outer loop
        for (int i=1; i<=n; i++) {
            // print spaces
            for (int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }
    
            //Here, we can use the code of Hollow rectangle
            for (int j=1; j<=n; j++) {
                    // for cell
                    if (i == 1 || j == 1 || i == n || j == m) {
                        //boundary cells
                        System.out.print("*");
                    } else {
                        //empty cells
                        System.out.print(" ");
                    }
                }
                System.out.println();   
        }
    }

    public static void diamond(int n) {
        /* First half */
        for (int i=1; i<=n; i++) {
            //Spaces
            for (int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }

            //Stars
            for (int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /* Second Half */
        for (int i=n; i>=1; i--) {
             //Spaces
             for (int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }

            //Stars
            for (int j=1; j<=(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        
        }
    }

    public static void numberPyramid(int n) {
        //outer loop
        for (int i=1; i<=n; i++) {
            //inner loop
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //to print numbers
            for (int a=1; a<=i; a++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void palindromic_pattern(int n) {
        //outer loop to print primary spaces
        for (int i=1; i<=n; i++) {
            //inner loop
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //descending order numbers
            for (int j=i; j>=1; j--) {
                System.out.print(j);
            }

            // ascending order
            for(int j=2; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
     
    public static void main (String args[]) {

         hollow_rectangle(4, 5);          // First Pattern
         System.out.println(); 

         inverted_halfPyramid(4);                       // Second Pattern
         System.out.println();

         inverted_half_pyramidWithNumbers(5);         //Third Pattern
         System.out.println();

         floyds_triangle(5);                         //Fourth Pattern
         System.out.println();  
        
         zero_one_triangle(5);                       //Fifth Pattern
         System.out.println();

         solid_rhombus(5);                               //Sixth Pattern
         System.out.println();

         butterFly(4);                                   //Seventh Pattern
         System.out.println();

         hollow_solid_rhombus(5, 5);                   //Eight Pattern
         System.out.println();

         diamond(4);                                     //Ninth Pattern
         System.out.println();

         numberPyramid(5);                               //Tenth Pattern
         System.out.println();

        palindromic_pattern(5);                         //Eleventh Pattern

       
    }
}
