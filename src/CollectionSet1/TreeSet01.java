package CollectionSet1;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {

      //  How much would you rate yourself out 10 in Java?

        TreeSet<Integer> ts1=new TreeSet<>();
        ts1.add(12);
        ts1.add(35);
        ts1.add(10);
        ts1.add(46);
        ts1.add(9);
        System.out.println(ts1);//order

        Long t1=System.nanoTime();//8042093264708
        System.out.println(t1);


        HashSet<Integer> hs1=new HashSet<>(ts1);
        Long t2=System.nanoTime();//8042093264708
        System.out.println(t2);
        System.out.println(hs1);//[35, 9, 10, 12, 46] //unorder

        System.out.println(t2-t1);
        System.out.println(t1-t2);


    }
}
