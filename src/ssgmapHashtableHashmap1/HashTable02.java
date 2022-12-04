package ssgmapHashtableHashmap1;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;
import java.util.TreeMap;

public class HashTable02 {
    public static void main(String[] args) {

        Hashtable<String, Integer> stdScore = new Hashtable<>();

        //How to put entries into a HashMap
        stdScore.put("Afra Cinar", 90);
        stdScore.put("Ali Tulubas", 95);
        stdScore.put("Betul Cavus", 100);
        stdScore.put("Can Aydin", 98);
        stdScore.put("M frotan", 90);


        //Example 1: Tum integer yaslarin ortalamasini hesaplayan kodu yaziniz.
        Collection<Integer> score = stdScore.values();
        int total = 0;

        /*
        for(Integer w : ages){
                if(w!=null){
                    sum = sum + w;
                    counter++;
                }
            }
         */
        double hesapla = 0;
        for(Integer w : score){
            total = total + w;
            hesapla++;
        }
        System.out.println("Ortalama score: " + (total/hesapla));

        //Example 1:  B veya  M icerdigi toplam karakter sayisini bulan kodu yaziniz.

        Set<String> names = stdScore.keySet();
        int sum1 = 0;
        for(String w : names){
            if(w.startsWith("M") || w.startsWith("B")){
                sum1 = sum1 + w.length();
            }
        }
        System.out.println(sum1);

    }
}
