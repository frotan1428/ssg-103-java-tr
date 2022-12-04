package CollectionQueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Deque02 {

    public static void main(String[] args) {
        // verilen liste de 10 buyuk olan elemenlari ekranda yaziniz.

        //rate

        //

        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        numbers.add(24);
        numbers.add(2);
        System.out.println(numbers);

        Deque<Integer> newList = new LinkedList<>();

        for (Integer w: numbers){
            if (w<10){
                newList.add(w);
            }
        }
        System.out.println(newList);

        TreeSet<Integer>  treeSet=new TreeSet<>(numbers);

      ///  treeSet.addAll(numbers);
        System.out.println(treeSet);





    }
}
