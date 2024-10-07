package Assignment;


import java.util.*;

public class VarQues2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int side, area;
        System.out.println("Enter the Side of a square: ");
        side = sc.nextInt();
    // Area of a square
        area = side * side;
        
        System.out.println("Area of the Square is: " + area);
        sc.close();
        
    }
    
}
