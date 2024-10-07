
public class CharPattern {
    public static void main (String args[]) {

        int n = 6;
        char ch = 'A';

        //inner loop
        for (int line=1; line<=n; line++) {
            //outer loop
            for (int charc=1; charc<=line; charc++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        //System.out.println("Love You *****");
    }
}
