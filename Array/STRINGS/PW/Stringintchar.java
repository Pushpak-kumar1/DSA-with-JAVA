package Array.STRINGS.PW;

import java.util.*;

public class Stringintchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "abc";
        str = str + "def";  // pointing to new dabba
        str += 'p'; // single size ki string banegi pehle
        str += 10;
        System.out.println(str);

        sc.close();
    }
    
}
