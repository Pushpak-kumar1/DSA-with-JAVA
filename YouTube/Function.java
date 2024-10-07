package YouTube;

import java.util.Scanner;

public class Function {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your name: ");
        String name = sc.next();

        printMyName(name);
        printMyName(name);
        sc.close();
    }
}
