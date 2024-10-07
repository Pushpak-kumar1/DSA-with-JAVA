package Array.STRINGS.PW;

//import java.util.*;

public class string_builder {
    public static void main(String args[]) {
        StringBuilder str = new StringBuilder("Hello");
        
        str.append(" world");
        str.setCharAt(0, 'D');

        System.out.println(str);
    }
}
