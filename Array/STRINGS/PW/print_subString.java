package Array.STRINGS.PW;

//import java.util.*;

public class print_subString {
    public static void main(String args[]) {
        
        String str = "abcd";   // index goes 0 - 3

        for (int i=0; i<4; i++) {
            for (int j=i+1; j<=4; j++) {
                System.out.print(str.substring(i, j) + " ");
            }
        }

    }
}
