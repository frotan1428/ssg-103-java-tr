package TreeMap3;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap02 {

    public static void main(String[] args) {

        //Example 1: Tum integer score ortalamasini hesaplayan kodu yaziniz.
        TreeMap<String, Integer> stdScore = new TreeMap<>();

        //How to put entries into a HashMap
        stdScore.put("Afra Cinar", 90);
        stdScore.put("Ali Tulubas", 95);
        stdScore.put("Betul Cavus", 100);
        stdScore.put("Can Aydin", 98);
        stdScore.put("M frotan han", 90);
        stdScore.put("Hulya ",null);

        Collection<Integer> score = stdScore.values();
// 1 yol
//        int ort =0;
//        for (Map.Entry<String,Integer> w: stdScore.entrySet()){
//            ort+=w.getValue();
//        }
//        System.out.println(ort/stdScore.size());//94
//
//        // 2 yol
//        Collection<Integer> values = stdScore.values();
//
//        int sum = 0;
//        for (Integer w: values){
//            sum = sum + w;
//        }
//        System.out.println("Ortalama : "+sum/ values.size());

//?

   int total=0;
        int counter=0;
        // yol
        for (Integer w: score){
            if (w!=null){
                total= total+w;
                counter++;
            }
        }
        System.out.println(total/counter);


        //Example 2:  B veya  M   ile basliyorsa ekrana  bulan kodu yaziniz.

//        Set<String > name= stdScore.keySet();
//
//
//        for (String w  :name){
//
//        }

        Set<String> keys = stdScore.keySet();
        for (String w: keys){
            if (!(w.startsWith("B") || w.startsWith("M"))){
                System.out.println(w);
            }
        }

        // //Example 3:  B veya  M icerdigi toplam karakter sayisini bulan kodu yaziniz.

        int sum=0;
        for (String w: keys){

            if (w.contains("B") || w.contains("M")){
                sum +=w.length();
            }

        }
        System.out.println(sum);


    }

}
