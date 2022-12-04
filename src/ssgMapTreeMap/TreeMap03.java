package ssgMapTreeMap;

import java.util.*;

public class TreeMap03 {
    public static void main(String[] args) {

        /*
            Aşağıdaki anahtarlara ve değerlere sahip olacak bir MAP oluşturun
            Math = 9
            inglizce = 8
            Farsca = 7
            Turkce = 6
            Fransizce = 7
            Ardından, 7'den fazla olan tüm dersleri ve puanlarını yazdırın
             */

        TreeMap<String, Integer> hm1 = new TreeMap<>();
        hm1.put("Math", 9);
        hm1.put("inglizce", 8);
        hm1.put("Farsca", 7);
        hm1.put("Turkce", 6);
        hm1.put("Fransizce", 7);
        // 1.way


        Set<Map.Entry<String, Integer>> SetForm2 = hm1.entrySet();
        for (Map.Entry<String, Integer> w : SetForm2) {
            if (w.getValue() > 7) {
                System.out.println(" 7'den fazla olan tüm dersleri: " + w.getKey() + "  :" + w.getValue());
            }
        }
        // way:
        Set<String> key = hm1.keySet();
       // System.out.println(key.size());

        Collection<Integer> values = hm1.values();
       // System.out.println(values.size());

        for (Integer w : values) {
            if (w > 7) {
                System.out.println("value:  " + w);
            }

        }

    }
}
