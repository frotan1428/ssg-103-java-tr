package CollectionQueue;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {

    public static void main(String[] args) {


        Deque<Integer> ll1 = new LinkedList<>();
        ll1.add(12);
        ll1.add(13);
        ll1.add(15);
        ll1.add(15);
        ll1.add(14);
        ll1.add(43);

//        System.out.println(ll1.peek());
//        System.out.println(ll1.poll());
       //   System.out.println(ll1.pollFirst());

        System.out.println(ll1.pop());
        System.out.println(ll1);
       ll1.push(20);
        System.out.println(ll1);

        ll1.removeLastOccurrence(15);
        System.out.println(ll1);
        ll1.removeFirstOccurrence(15);
        System.out.println(ll1);




    }
}
