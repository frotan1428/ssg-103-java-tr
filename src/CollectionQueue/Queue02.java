package CollectionQueue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Queue02 {
    public static void main(String[] args) {

        HashSet<String> languages1 = new HashSet<>();
        // insert element to the ArrayList
        languages1.add("JavaScript");
        languages1.add("Python");
        languages1.add("Java");
        System.out.println("LinkList  1: " + languages1);

        // create another ArrayList
        HashSet<String> languages2 = new HashSet<>();
        // add elements to ArrayList
        languages2.add("English");
        languages2.add("Java");
        languages2.add("Python");
        System.out.println("LinkList 2: " + languages2);

//        System.out.println(languages1.addAll(languages2));
//        System.out.println(languages1);

        System.out.println(languages2.retainAll(languages1));//true

        System.out.println(languages2);

    }
}
