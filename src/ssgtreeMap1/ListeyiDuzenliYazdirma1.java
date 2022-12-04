package ssgtreeMap1;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class ListeyiDuzenliYazdirma1 {

    public static void main(String[] args) {

        Map<Integer,String> sinif=Students.myMap();

        System.out.println(sinif);//{101=Ali, Can, Dev, 1453, 102=Veli, Yan, QA, 1990, 103=Ali, Yan, C#, 2000, 104=Ayse, Kan, C#, 2001, 105=Fatma, Han, Java, 2002}

        sinifListeYazdir(sinif);
    }

    public static void sinifListeYazdir(Map<Integer,String> sinif){

        Set<Integer> keyset= sinif.keySet();
        System.out.println(keyset);

        Collection<String> valuSet=sinif.values();
        System.out.println(valuSet);

        for (String w:valuSet){
            System.out.println(w);
        }


    }

}
