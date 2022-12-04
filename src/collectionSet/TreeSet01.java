package collectionSet;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {
        /*
        TreeSet tekrarsiz elemanlari "alfabetik" veya "kucukten buyuge"(Natural Order) dizer.
        TreeSet cooook yavas calisir.
        Note: Tekrarsiz elemanlari natural order da depolamak icin TreeSet kullanmak
              mantiklidir ama TreeSet ler coook yavas calistigi icin biz,
              elemanlari once HashSet depolariz sonra HashSet'i TreeSet e cevirerek
              TreeSet in yavas olma problemini asmis oluruz.
*/


    public static void main(String[] args) {

        Long t1 = System.nanoTime();
        TreeSet <Integer> ts1=new TreeSet<>();
        ts1.add(12);
        ts1.add(35);
        ts1.add(10);
        ts1.add(46);
        ts1.add(9);

        System.out.println(ts1);// [9, 10, 12, 35, 46]


        /*
        How to Store unique elements  in natural order.
        I can use TreeSet.
        Yes ,but you know TreeSet is so slow how you can make it Faster?

        I will first Create  a HashSet   and add all elements to a hashSet.
        Then I can convert theme into a TreeSet it will be faster.


         */
        Long t2 = System.nanoTime();
        // 1 st way:
        TreeSet<String> ts2=new TreeSet<>();
        ts2.add("K");
        ts2.add("Z");
        ts2.add("A");
        ts2.add("C");
        ts2.add("T");
        System.out.println(ts2);//[A, C, K, T, Z]  //order

        //2 way
        Long t3 = System.nanoTime();
        HashSet<String> hs1=new HashSet<>();
        hs1.add("K");
        hs1.add("Z");
        hs1.add("A");
        hs1.add("C");
        hs1.add("T");
        System.out.println(hs1);//[A, C, T, Z, K] unorder

        TreeSet <String> ts3=new TreeSet<>(hs1);
        ts3.addAll(hs1);
        System.out.println(ts3);//[A, C, K, T, Z]

        System.out.println(t2-t1);
        System.out.println(t3-t2);
    }
}
