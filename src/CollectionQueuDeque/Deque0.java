package CollectionQueuDeque;

import java.util.*;

public class Deque0 {
    public static void main(String[] args)
    {
        // Initializing an deque
        Deque<String> dq = new LinkedList<>();

        // add() method to insert

        dq.add("tech");
        dq.add("pro");
        dq.add("education");
        dq.add("memnun musnuz");
        dq.add("evet");
        dq.addFirst("Arkadaslar ");

        System.out.println(dq);

    }
}
