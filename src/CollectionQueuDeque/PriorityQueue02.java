package CollectionQueuDeque;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue02 {

    public static void main(String[] args) {

        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        numbers.add(24);
        numbers.add(2);


        //1 yontem
//        Iterator<Integer> it = numbers.iterator();
//        while(it.hasNext()) {
//            Integer i = it.next();
//            if(i < 10) {
//                it.remove();
//            }
//        }
//        System.out.println(numbers);


        //2 way
        PriorityQueue<Integer> number1 = new PriorityQueue<>();
        for (Integer w:numbers){
            if (w>=10){
//                System.out.print(w+ " ");
                number1.add(w);
            }
        }

        System.out.println(number1);
    }
}
