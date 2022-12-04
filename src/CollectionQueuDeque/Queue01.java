package CollectionQueuDeque;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {

       /*
        Ilk giren elemani ilk kullanmaniz(First In First Out ==> FIFO) gerektiginde Queue en iyi secimdir.
        Queue da elemanlar "insertion order" a gore dizilirler.
        Queue da peek(), poll(), element(), remove() gibi ilk elemani ilgilendiren bir cok method vardir.
        offer() method'u kapasite kontrolu yapildiktan sonra eleman ekleme durumlarinda kullanilir.
     */
     /*   Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
              When using a capacity-restricted queue, this method is generally preferable to add, which can fail to insert an element only by throwing an exception.
              Returns: "true" if the element was added to this queue, else false
             Throws:
            ClassCastException – if the class of the specified element prevents it from being added to this queue
           NullPointerException – if the specified element is null and this queue does not permit null elements
          IllegalArgumentException – if some property of this element prevents it from being added to this queue
         */
       public static void main(String[] args) {

           /*

            Deque==>First in Last out
            Queue==> First in First out
     */


           Queue<Integer> q = new LinkedList<>();
           for (int i = 0; i < 5; i++) {
               q.add(i);
           }
           System.out.println(q);

            Deque<String> dq1=new LinkedList<>();

               dq1.add("A");
               System.out.println(dq1);//[A]
               dq1.addFirst("B");
               System.out.println(dq1);//[B, A]
               dq1.addFirst("C");
               System.out.println(dq1);//[C, B, A]
               dq1.addLast("D");
               System.out.println(dq1);//[C, B, A, D]

       }

}
