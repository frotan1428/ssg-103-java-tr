package CollectionQueuDeque;

import java.util.*;

public class Queue02 {

    public static void main(String[] args) {
        // create an ArrayList
        Queue<String> languages1 = new LinkedList<>();

        // insert element to the ArrayList
        languages1.add("JavaScript");
        languages1.add("Python");
        languages1.add("Java");
        System.out.println("ArrayList 1: " + languages1);

        // create another ArrayList
        ArrayList<String> languages2 = new ArrayList<>();

        // add elements to ArrayList
        languages2.add("English");
        languages2.add("Java");
        languages2.add("Python");
        System.out.println("ArrayList 2: " + languages2);

        // retain the common element
        languages1.retainAll(languages2);
        System.out.println("Common Elements: " + languages1);
    }
}
