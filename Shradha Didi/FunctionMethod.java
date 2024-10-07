
import java.util.*;

public class FunctionMethod {

    public static void printName() {            // this is function declaring
        System.out.println("Hello World!");
        return;
    }

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        //System.out.print("Enter Your name: ");
        //String name = "Pushpak";

        printName(); //this is function call
        printName();
        printName();
        sc.close();
    }
    
}
