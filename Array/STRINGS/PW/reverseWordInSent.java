package Array.STRINGS.PW;
import java.util.*;

public class reverseWordInSent {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        String ans = "";
        StringBuilder sb = new StringBuilder("");

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch != ' ') {
                sb.append(ch);
            } else {
                sb.reverse();
                ans += sb;
                ans += " ";
                sb = new StringBuilder("");
            }
        }
        sb.reverse();
        ans += sb;
        System.out.println(ans);

        sc.close();
    }
}
