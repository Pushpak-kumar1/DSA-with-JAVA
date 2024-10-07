package Recursion.PW;
import java.util.*;

public class remove_occurence {
    public static String removeA(String str, int idx) {
        // base case
        if(idx == str.length()) return "";

        //recursive work
        String smallAns = removeA(str, idx+1);
        char currChar = str.charAt(idx);

        //self work
        if(currChar == 'a') {
            return smallAns;
        } else {
            return currChar + smallAns;
        }
    }

    // remove occurence of 'a' with passing index

    public static String removeA2(String str) {
        // base case
        if(str.length() == 0) return "";

        // recursive work
        String smallAns = removeA2(str.substring(1));
        char currChar = str.charAt(0);

         //self work
         if(currChar == 'a') {
            return smallAns;
        } else {
            return currChar + smallAns;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        // String ans = "";

        // for(int i=0; i<str.length(); i++) {
        //     if(str.charAt(i) != 'a') {
        //         ans += str.charAt(i);
        //     }
        // }
        // System.out.println(ans);

      //  System.out.println(removeA(str, 0));
      System.out.println(removeA2(str));
        sc.close();
    }
}
