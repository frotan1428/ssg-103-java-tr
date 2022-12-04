package CollectionQueue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue01 {

    public static void main(String[] args) {

        Queue<String> pq = new PriorityQueue<>();

        pq.add("HTML");
        pq.add("CCS");
        pq.add("BOOTSTRAP");
        pq.add("JAVASCRIPT");


        System.out.println(pq);
        for (String w:pq){
            System.out.print(w +" ");
        }

        //Itreator

        System.out.println("=======");
        Iterator iterator=pq.iterator();

      while (iterator.hasNext()){
          System.out.print(iterator.next() + " ");
      }


    }
}
