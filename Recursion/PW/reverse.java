package Recursion.PW;
import java.util.*;

public class reverse {
    public static String reverseStr(String str, int idx) {
        if(idx == str.length()) return "";
        String smallAns = reverseStr(str, idx+1);
        return smallAns + str.charAt(idx);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        System.out.println(reverseStr(str, 0));

        sc.close();
    }    
}
