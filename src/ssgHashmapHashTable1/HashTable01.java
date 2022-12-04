package ssgHashmapHashTable1;

import java.util.*;

public class HashTable01 {

    public static void main(String[] args) {


        Hashtable<Integer, String> ht1 = new Hashtable<>();

        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");

        ht1.put(4, "four");
        ht1.put(5, "five");
        ht1.put(6, "six");

        System.out.println(ht1); //{6=six, 5=five, 4=four, 3=three, 2=two, 1=one};

        System.out.println(ht1.values());//[six, five, four, three, two, one]
        System.out.println(ht1.keySet());//[6, 5, 4, 3, 2, 1]
       // System.out.println(ht1.keys());//java.util.Hashtable$Enumerator@5ca881b5

        System.out.println(ht1.entrySet());//[6=six, 5=five, 4=four, 3=three, 2=two, 1=one]


        for (Map.Entry<Integer,String> w: ht1.entrySet()){
            System.out.println(w.getKey()+ "  "+w.getValue());
        }


        //Example 1: Tum integer sayilrin ortalamasini hesaplayan kodu yaziniz.

        Set<Integer> score = ht1.keySet();

        int total=0;
        int  counter =0;

        for (Integer w: score){
            total= total+w;
            counter++;

        }
        System.out.println("ortalama scroe "+ (total/counter));





    }
}
