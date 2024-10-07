
package ArrayList;

import java.util.*;

public class first {
    @SuppressWarnings("unused")
    public static void main(String args[]) {
        //Java Collection Framework
        ArrayList<Integer> list = new ArrayList<>();    // if you don't specify the class, then you can put anything inside it....
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // add operation
        list.add(1); //O(1)
        list.add(44);
        list.add(12);
        list.add(16);
        list.add(16);
        list.add(8);


        //print using the loop
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // print without using the loop
        System.out.println(list);

        //Get operation
        int element = list.get(2);
        System.out.println(element);

        //remove operation
        list.remove(2);        // list.remove(Interger.valueOf(18)); -> it will return bool value
        System.out.println(list);

        //set element at index (10 at place 0f 12)
        list.set(2, 10);
        System.out.println(list);

        //to check the lenght of the arrayList
        System.out.println(list.size());

        //kya koi element exist kerta hai ki nhi
        System.out.println(list.contains(10));
        System.out.println(list.contains(49));
    }
    
}
