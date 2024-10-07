package Recursion.PW;
import java.util.*;

public class is_palindrome {
    public static String reverseStr(String str, int idx) {
        if(idx == str.length()) return "";
        String smallAns = reverseStr(str, idx+1);
        return smallAns + str.charAt(idx);
    }

    // checking palindrome without reverseing the String

    public static boolean isPalindrome(String str, int l, int len) {
        if(l >= len) return true;
        return (str.charAt(l) == str.charAt(len) && isPalindrome(str, l+1, len-1));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        int len = str.length();

        String rev = reverseStr(str, 0);
        if(rev.equals(str)) {
            System.out.printf("%s Yes this is Palindrome", str);
        } else {
            System.out.printf("%sthis is not a palindrome", str);
        }
        System.out.println();
        System.out.println(isPalindrome(str, 0, len-1));
        sc.close();
    }    
}
