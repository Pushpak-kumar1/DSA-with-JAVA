 package Practice;

// public class Occurrence {
// public static void removeChar(String s, String c) {
//     int j, count = 0, n = s.length();
//     char[]t = s.toCharArray();
//     for (int i=j=0 ;i<n; i++) {
//         if (t[i] != c) {
//         t[j++] = t[i];

//          } else {
//         count ++;
//          }
//     }while (count > 0) {
//         t[j++] = '\0';
//         count--;
//     }
//     System.out.println(t);

//    } 

// public static void main(String args[]) {
//     String s = "daabcbaabcbc";
//     removeChar(s, "abc");
//    }
// }

//Package Practice;

public class Occurrence {
    public static String deleteOccurence(String s, String part) {
        int l = part.length();

        while(true) {
            int index = s.indexOf(part);

            if (index >-1) {
                s = s.substring(0, index) + s.substring(index + l);
            } else {
                break;
            }
        }
        return s;
    }

    public static void main (String args[]) {
        String s = "daabcbaabcbc";
        String part = "abc";

        System.out.println(deleteOccurence(s, part));
    }
}