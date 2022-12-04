package ssgtreeMap1;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap01 {


    public static void main(String[] args) {

        /*
            Aşağıdaki key ve values sahip olacak bir MAP oluşturun
            Math = 9
            inglizce = 8
            Farsca = 7
            Turkce = 6
            Fransizce = 7
           // Ardından, 7'den fazla olan tüm dersleri ve puanlarını yazdırın
             */

        TreeMap<String, Integer> hm1 = new TreeMap<>();
        hm1.put("Math", 9);
        hm1.put("inglizce", 8);
        hm1.put("Farsca", 7);
        hm1.put("Turkce", 6);
        hm1.put("Fransizce", 7);

        System.out.println(hm1.keySet());//[Farsca, Fransizce, Math, Turkce, inglizce]
        System.out.println(hm1.values());//[7, 7, 9, 6, 8]

        System.out.println(hm1.entrySet());//[Farsca=7, Fransizce=7, Math=9, Turkce=6, inglizce=8]


        System.out.println(hm1);//{Farsca=7, Fransizce=7, Math=9, Turkce=6, inglizce=8}


        Set<Map.Entry<String,Integer>> setForm1= hm1.entrySet();
        System.out.println(setForm1);//[Farsca=7, Fransizce=7, Math=9, Turkce=6, inglizce=8]


        for (Map.Entry<String,Integer> w:setForm1){
            if (w.getValue()> 6){
                System.out.println("7'den fazla olan tüm dersleri "+ w.getKey() + ":"+w.getValue());
            }
        }









    }
}
