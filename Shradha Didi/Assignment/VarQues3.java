package Assignment;



import java.util.Scanner;

public class VarQues3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        float pencil = sc.nextInt();
        float eraser = sc.nextInt();
        float pen = sc.nextInt();

        float total = pencil + eraser + pen;
        System.out.println("Bill is:" + total);

        
    // Add on with 18% gst.
        float newtotal = total  + (0.18f + total);
        System.out.println("Bill will gst is:" + newtotal);
        sc.close();
        
    }
}
