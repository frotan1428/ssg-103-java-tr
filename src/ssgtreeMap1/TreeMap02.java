package ssgtreeMap1;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap02 {

    public static void main(String[] args) {

        TreeMap<String, Integer> stdScore = new TreeMap<>();

        //How to put entries into a HashMap
        stdScore.put("Afra Cinar", 90);
        stdScore.put("Ali Tulubas", 95);
        stdScore.put("Betul Cavus", 100);
        stdScore.put("Can Aydin", 98);
        stdScore.put("M frotan", 90);

//        for (Integer w: score){
//            if (w!=null){
//                total= total+w;
//                counter++;
//            }
//        }

        //Example 1: Tum integer score ortalamasini hesaplayan kodu yaziniz.

        Collection<Integer> score = stdScore.values();

        int total=0;
        int  counter =0;

        for (Integer w: score){
                total= total+w;
                counter++;

        }
        System.out.println("ortalama scroe "+ (total/counter));


        //Example 2:  B veya  M   ile basliyorsa ekrana  bulan kodu yaziniz.

        Set<String> names= stdScore.keySet();

        for (String w : names){
            if ((w.contains("B") || w.contains("M"))) {
                System.out.print(w +" ");
            }
        }
        System.out.println();

       //Example 3:  B veya  M icerdigi toplam karakter sayisini bulan kodu yaziniz.


        int sum=0;
            for (String w : names){
               if (w.contains("B") || w.contains("M")) {
                   sum = sum + w.length();
               }
            }
        System.out.println(sum);

    }
}
