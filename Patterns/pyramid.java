package Patterns;

public class pyramid {
    public static void main(String args[]) {
        int row = 5;

    //outer loop for rows
    for(int i=1; i<=row; i++) {
        //inner loop for spaces
        for(int j=1; j<=row-i; j++) {
            System.out.print(" ");
        }
        // anothe loop for the stars
        for(int s=1; s<=(2*i)-1; s++) {
            System.out.print("*");
        }
        System.out.println();
    }

    for(int i=row; i>=1; i--) {
        //inner loop for spaces
        for(int j=1; j<=row-i; j++) {
            System.out.print(" ");
        }
        // anothe loop for the stars
        for(int s=1; s<=(2*i)-1; s++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

}