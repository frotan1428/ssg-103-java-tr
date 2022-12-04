package CollectionQueuDeque;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {

    /*
        Deque: Double Ended Queue manasindadir yani iki uclu Queue demektir.
        FIFO(First In First Out) ve LIFO(Last In First Out) beraber gerektiginde kullanilir.
     */

    /*
                Pushes an element onto the stack represented by this deque (in other words, at the head of this deque)
                if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
                This method is equivalent to addFirst.
                Throws:
                IllegalStateException – if the element cannot be added at this time due to capacity restrictions
                ClassCastException – if the class of the specified element prevents it from being added to this deque
                NullPointerException – if the specified element is null and this deque does not permit null elements
                IllegalArgumentException – if some property of the specified element prevents it from being added to this deque
         */

      /*
            Deque==>First in Last out
            Queue==> First in First out
     */
    // List'den gelen ozellikleri biliyoruz
    // onun icin Deque'den gelen ozelliklere bakalim

    public static void main(String[] args) {

        Deque<Integer> ll1 = new LinkedList<>();
        ll1.addFirst(10); // basa element ekler
        ll1.addLast(20); // sona element ekler, add() gore daha hizlidir
        System.out.println(ll1);
        System.out.println(ll1.element()); // ilk elementi silmeden bize dondurur
        // ilk element yoksa exception firlatir
        System.out.println(ll1);

        System.out.println( ll1.getLast() ); // son elementi silmeden bize dondurur
        System.out.println( ll1.getFirst() ); // ilk elementi silmeden bize dondurur

        ll1.offer(30); // sona ekler ama bize birsey dondurmez
        System.out.println(ll1);
        ll1.offerLast(40); // // sona ekler ve bize true dondurur
        System.out.println(ll1);
        ll1.offerFirst(50);
        System.out.println(ll1);

        System.out.println(ll1.peek());// ilk elementi silmeden bize dondurur,
        // bulamazsa null dondurur

    }


}
