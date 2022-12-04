package TreeMap3;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListyiDuzenlliYazdir {

    public static void main(String[] args) {

        // myMap();
        Map<Integer,String> sinif =Students.myMap();

        System.out.println(sinif);

        System.out.println(sinif.values());
        System.out.println(sinif.keySet());
        System.out.println(sinif.entrySet());
        sinifListYazdir(sinif);


    }

    public static void sinifListYazdir(Map<Integer,String> sinif){

        Set<Integer> keyset = sinif.keySet();
        System.out.println(keyset);

        Collection<String> valuSet=sinif.values();
        System.out.println(valuSet);

        for (String w:valuSet){
            System.out.println(w);
        }



    }
}
