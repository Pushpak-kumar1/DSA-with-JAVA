
public class OverloadFunc {
    //func to cal int sum
    public static int sum(int a, int b) {
        return a + b;
    }

    // func to cal float sum
    public static float sum(float a, float b) {
        return a + b;
    }
    
    public static void main (String args[]) {
        System.out.println(sum(5, 9));
        System.out.println(sum(4.5f, 4.5f));
    }

}