package Array.STRINGS.PW;

import java.util.*;

public class Toggle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);

        // toggle = PusHpAk -> pUShPaK
        for(int i=0; i<str.length(); i++) {
            // check -> alphabet - small hai ya capital
            boolean flag = true;                // true -> capital
            char ch = str.charAt(i);
            int asci = (int)ch;
            System.out.println(asci);

            if (asci >= 97) flag = false;
            
            if (flag == true) {                // capital
                asci += 32;
                char dh = (char)asci;
                str.setCharAt(i, dh);
            }
            else {                             // small letter
                asci -= 32;
                char dh = (char)asci;
                str.setCharAt(i, dh);
            }
        }
        System.out.println(str); 
        sc.close();
    }
}