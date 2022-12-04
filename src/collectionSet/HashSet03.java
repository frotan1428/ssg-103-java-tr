package collectionSet;

import java.util.HashSet;
import java.util.Set;

public class HashSet03 {
    public static void main(String[] args) {


        // iki hashset 'e benzer elmenleri yaziniz.

         //  set1= [20, 10]
        // set2 = [20, 25, 10, 30]
        //output //[20,10]

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();


        set1.add(5);
        set1.add(10);
        set1.add(30);

        set2.addAll(set1);
        set2.add(25);
        set2.add(30);

        System.out.println(set1); // [20, 10]
        System.out.println(set2); // [20, 25, 10, 30]

        System.out.println(set2.retainAll(set1)); // true

        System.out.println(set1); // [20, 10]
        System.out.println(set2); // [20, 10]
    }
}
