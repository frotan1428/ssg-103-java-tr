package ssgmapHashtableHashmap1;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTable01 {

    /*
            1)HashTable bir map'dir.
            2)HashTable entrySet'leri herhangi bir sirlamaya tabi tutmaz.
            3)HashTable, HashMap'lerden daha yavastir. Cunku HashTable'lar thread-safe ve synchronized'dir.
            4)HashTable'larda key null olamaz. Key'i null yaparsaniz NullPointerException atar.
            5)HashTable'larda value null olamaz. Value'yu null yaparsaniz NullPointerException atar.

            Note: toString() method'u obje'leri console'da detaylari ile gorebilmek icin class'larin icinde olusturulur.
                  toString() method'unu olusturmadan object'i console'a yazdirirsaniz Java o object'in address'ini yazdirir.

     */

    public static void main(String args[])
    {

        Hashtable<Integer, String> ht1 = new Hashtable<>();

        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");

        ht1.put(4, "four");
        ht1.put(5, "five");
        ht1.put(6, "six");


        // Print mappings to the console
        System.out.println("Mappings of ht1 : " + ht1);


        //entrySet() method'u Map'deki elemanlari bir Set'in icine koyarak size verir
        // Iterating using enhanced for loop
        for (Map.Entry<Integer, String> e : ht1.entrySet())
            System.out.println(e.getKey() + " "
                    + e.getValue());


        // 2 way:
        System.out.println("=====");
        Set<Map.Entry<Integer,String>> entries = ht1.entrySet();
        for(Map.Entry<Integer,String> w : entries){
            System.out.println(w);
        }


    }







}
