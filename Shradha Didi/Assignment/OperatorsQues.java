package Assignment;



public class OperatorsQues {
    public static void main (String args[]) {

        int a = 2;
        int b = 5;

        int exp1 = (a * b / a);
        int exp2 = a * (b / a);

        System.out.println(exp1);
        System.out.println(exp2);

        int x = 200, y = 50, z = 100;

        if (x > y && y > z) {
            System.out.println("Hello");
        }
        if (z > y && z < x) {
            System.out.println("JAVA");
        }
        if ((y + 200) < x && (y + 150) < z) {
            System.out.println("Hello Java");
        }
    }
    
}
