                            /* String Function */
package Array.STRINGS;

public class subString {
    public static  String sub_String(final String str, final int si, final int ei) {
        String substr = "";
        for(int i=si; i<ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]) {
        //Substring
        String str = "HelloWorld";
       // System.out.println(str.substring(0, 5));         //Inbuilt Function
        System.out.println(sub_String(str, 0, 5));
    }
}
