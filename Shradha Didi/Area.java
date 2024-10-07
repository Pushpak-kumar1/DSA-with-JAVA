import java.util.*;

public class Area {

    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Radius of the Circle: ");
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;

        System.out.println("Area of the Circle is: " + area);
        sc.close();

    }
    
}
