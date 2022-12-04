package CollectionQueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
     //  Queue==> First in First out
        for (int i=1; i<10; i++){
            q.add(i);
        }

        System.out.println(q);

        Deque<String> dq1=new LinkedList<>();

        dq1.add("A");
        System.out.println(dq1);
        dq1.add("B");
        System.out.println(dq1);
        dq1.addFirst("C");
        System.out.println(dq1);
        dq1.addLast("E");
        dq1.add("B");
        dq1.addFirst("X");
        System.out.println(dq1);

        System.out.println(dq1.getLast());










    }
}
