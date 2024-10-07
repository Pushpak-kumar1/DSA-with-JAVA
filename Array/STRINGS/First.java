package Array.STRINGS;

public class First {
    public static void printLetters(String str) {
        for (int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main (String args[]) {
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str1 = "abcd";
        // String str2 = new String("xyz");

        //Strings are immutable (Always remember this thing)

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println(name);

        // String fullName = "Pushpak Kumar";
        // System.out.println(fullName.length());

        //Concetenation
        String firstName = "Pushpak";
        String lastName = "Kumar";
        String fullName = firstName + " " + lastName;
       

        printLetters(fullName);
    }
}
