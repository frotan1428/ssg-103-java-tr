package collectionSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSet01 {
     /*
         Hash bir tekniktir,birbirine benzemeyen code'lar üretir bu code'lar data'yi unique yapar.
         Set'lere, çoklu ama tekrarsız data depolamak istediğimizde ihtiyaç duyarız.(Oğrenci numaraları gibi)
         HashSet'ler eklenen elemanlarin siralamasi ile ugrasmaz. Siralama ile alakali
         zaman harcamaz b =u yuzden cok hizli calisir.
         HashSet'ler index kullanmazlar. Cunku siralama rastgele yapildigi icin index manali olmaz.
         HashSetler:
            1)Tekrarsiz elemanlarda
            2)Sıralama onemli degilse
            3)Hız cok önemliyse
            4)Indeks kullanmazlar


            //
        //Var olan elemani eklerseniz hata vermez, son ekleneni var olan data nin ustune yazar. (Overwrite)
     */


    public static void main(String[] args) {

        HashSet<String> hs1=new HashSet<>();

        hs1.add("K");
        hs1.add("K");
        hs1.add(null);
        hs1.add(null);
        System.out.println(hs1);//[null, K]
        System.out.println(hs1.size());//2 null in HasSet  is also a value.

        HashSet<String> hs2=new HashSet<>();
        hs2.add("K");
        hs2.add(null);
        System.out.println(hs2);//[null, K]

        System.out.println(hs1.equals(hs2));//true  //[null, K] // [null, K]

        //Interview Question :Type a code to display arraylist elements only on.
        // verilen bir ArrayListe  tekrarsiz  elemenleri yaziniz.


        List<Integer> list=new ArrayList<>();

        list.add(5);
        list.add(3);
        list.add(5);
        list.add(3);
        list.add(5);
        list.add(2);

        System.out.println(list);//[5, 3, 5, 3, 5, 2] 5 and 3 duplicate how i can print just one pair

        HashSet<Integer> hs3=new HashSet<>();
        hs3.addAll(list);
        System.out.println(hs3);//[2, 3, 5]

        //What was the difference between HashSet and SET ?
        // set is an interface we can't create object,but hashSet Create object.


        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("A");
        set.add(null);
        System.out.println(set);//[null, A]

    }



}
