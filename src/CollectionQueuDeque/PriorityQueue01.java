package CollectionQueuDeque;

import java.util.*;

public class PriorityQueue01 {
    //(oncelik)PriorityQueue Java kendisine gore bir oncelik belirleyerek siralama yapar
    //Biz istersek siralamayi belirleyebiliriz

    public static void main(String args[]) {

        Queue<String> pq = new PriorityQueue<>();

        pq.add("HTML");
        pq.add("CCS");
        pq.add("BOOTSTRAP");
        pq.add("JAVASCRIPT");




        System.out.println(pq);//[BOOTSTRAP, HTML, CCS, JAVASCRIPT]

        //1 way
        Iterator iterator = pq.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        //2way
        System.out.println();
        for (String w:pq){
            System.out.print(w + " ");
        }



    }

}
