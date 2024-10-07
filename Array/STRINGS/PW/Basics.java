package Array.STRINGS.PW;

import java.util.*;

public class Basics {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
       // String str = sc.next(); // does not recoganises spaces
       // System.out.println(str);

        // String str2 = sc.nextLine(); // recoganises spaces as well
        // System.out.println(str2);

        //System.out.println(str2.length()); // to know the size

        //CharAt() function
        String str = "Pushpak";
        //char ch = str.charAt(3);
        System.out.println(str.charAt(3));

        //indexOf() function
        System.out.println(str.indexOf('s'));

        //compareTo() function
        String first = "PUSHPAK";
        String second = "Anchal";
        System.out.println(first.compareTo(second));  // if both first and second same -> 0 && if first > second any +ve no.

        //contains() function
        System.out.println(first.contains("shp")); // only takes string not single char

        //starsWith and endsWith functionrecoganises spaces

        //toLowerCase() and toUpperCase function
        System.out.println(first.toLowerCase());
        System.out.println(second.toUpperCase());

        //concat() function
        System.out.println(first.concat( " Anchal"));

        sc.close();
    }
}
