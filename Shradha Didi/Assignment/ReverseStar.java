package Assignment;

public class ReverseStar {
    public static void main (String args[]) {

        for (int line=1; line<=4; line++) {
            //starting with fourth line
            for (int star=4; star>=line; star--) {     // for(int star=1; star<=star-line+1; star++)
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
