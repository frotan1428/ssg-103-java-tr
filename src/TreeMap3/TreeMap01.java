package TreeMap3;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap01 {
     /*
            Aşağıdaki key ve values sahip olacak bir MAP oluşturun
            Math = 9
            inglizce = 8
            Farsca = 7
            Turkce = 6
            Fransizce = 7
           // Ardından, 7'den fazla olan tüm dersleri ve puanlarını yazdırın.
             */


    public static void main(String[] args) {

        TreeMap<String, Integer> hm1 = new TreeMap<>();
        hm1.put("Math", 9);
        hm1.put("inglizce", 8);
        hm1.put("Farsca", 7);
        hm1.put("Turkce", 6);
        hm1.put("Fransizce", 7);

        System.out.println(hm1);//{Farsca=7, Fransizce=7, Math=9, Turkce=6, inglizce=8}

        System.out.println(hm1.keySet());//[Farsca, Fransizce, Math, Turkce, inglizce]

        System.out.println(hm1.values());//[7, 7, 9, 6, 8]


        //1 yol

        for (Map.Entry<String,Integer> w: hm1.entrySet()){
            if (w.getValue()>7){
                System.out.println(w);
            }
        }



        //2 yol
        Set<Map.Entry<String,Integer>> setForm=hm1.entrySet();

        System.out.println(setForm);
        for (Map.Entry<String,Integer> w:setForm){
            if (w.getValue()>7 ){
                System.out.println("7'den fazla olan tüm dersleri  :" +w.getKey()+ " "+w.getValue());
            }
        }

    }

}
