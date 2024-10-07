// Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.Scanner;

public class Circumference4 {
    
    public static Double circumferenceOfCircle(int radius) {
        return 2 * 3.14 * radius;
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        int radius = sc.nextInt();

        System.out.println(circumferenceOfCircle(radius));
        sc.close();
    }
    
}
