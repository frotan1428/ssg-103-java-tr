package ssgMapTreeMap;

import java.util.*;

public class TreeMap01 {

     /*
        1)TreeMap'ler entrySet'leri key'lere gore "natural order" da siralar.
        2)TreeMap'ler en yavas map'lerdir.
        3)TreeMap'ler thread-safe ve syncronized degildir.
     */

    public static void main(String[] args) {

        TreeMap<String, Integer> provincePopulations = new TreeMap<>();
        provincePopulations.put("Istanbul", 160000000);
        provincePopulations.put("Adana",  58000000);
        provincePopulations.put("Ankara", 58000000);
        provincePopulations.put("Izmir",  40000000);
        provincePopulations.put("Bursa",  30000000);
        System.out.println(provincePopulations);// {Adana=58000000, Ankara=58000000, Bursa=30000000, Istanbul=160000000, Izmir=40000000}

        //ceilingEntry(); var olan key ile kullanilirsa o key'i verir. Var olmayan bir key ile kullanilirsa bir sonrakini verir
        Map.Entry<String,Integer> abc = provincePopulations.ceilingEntry("I");
        System.out.println(abc);//Adana=58000000

        NavigableSet<String> keysInDescendingOrder =  provincePopulations.descendingKeySet();
        System.out.println(keysInDescendingOrder);// [Izmir, Istanbul, Bursa, Ankara, Adana]

        NavigableMap<String, Integer> mapInDescendingOrder =  provincePopulations.descendingMap();
        System.out.println(mapInDescendingOrder); //{Izmir=40000000, Istanbul=160000000, Bursa=30000000, Ankara=58000000, Adana=58000000}
 
        Map.Entry<String,Integer> def = provincePopulations.floorEntry("Izmir");
        System.out.println(def);//Izmir=40000000

        //lowerEntry("Germany") method gives the previous entry under every condition but floorEntry("Germany")
        // method gives the same entry for the existing keys
        //lowerEntry("Germany") method is like "<", floorEntry("Germany") is like "<="
        //lowerEntry("Mary Star") Mary Star'dan bir oncekini verir

        //lowerEntry("Paris Hilton") Paris Hilton'dan bir oncesini verir, Paris Hilton olmasa da sanki varmis gibi davranir

        Map.Entry<String,Integer>  ghi = provincePopulations.lowerEntry("Izmir");
        System.out.println(ghi);// Istanbul=160000000


        SortedMap<String,Integer> subMap1 =  provincePopulations.subMap("Istanbul","Izmir");
        System.out.println(subMap1);// {Istanbul=160000000}

        NavigableMap<String,Integer> subMap2 = provincePopulations.subMap("Istanbul", false, "Izmir", true);
        System.out.println(subMap2);// {Izmir=40000000}

        //tailMap() verilen key'den baslayarak sona kadar tum entry'leri size verir
        SortedMap<String,Integer> tailMap1 = provincePopulations.tailMap("Bursa");
        System.out.println(tailMap1);// {Bursa=30000000, Istanbul=160000000, Izmir=40000000}

        //tailMap(String, false) verilen key'den baslayarak sona kadar tum entry'leri size verir ama sizin verdiginiz key'i haric tutar
        NavigableMap<String,Integer> tailMap2 = provincePopulations.tailMap("Bursa", false);
        System.out.println(tailMap2);//{Istanbul=160000000, Izmir=40000000}

    }

}
