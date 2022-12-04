package ssgmapHashtableHashmap1;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class ListeyiDuzenliYazdirma {
    public static void main(String[] args) {
        // Sinif listesini duzenli bir sekilde yazdirmak
        Map<Integer,String> sinif=  Students.myMap();
        System.out.println(sinif);
        sinifListYazdir(sinif);
    }

    public static void sinifListYazdir(Map<Integer, String> sinif) {

        System.out.println("Numara  Isim   Soyisim  Brans");
        System.out.println("=============================");

        // Map yapisinda yazdirdigimizda kullanicilar bir sey anlamayabilir
        // bunun icin once map yapisini kodlarla manipule edip
        // map'deki datalari, istedigimiz formata sokmamiz gerekir
        // 1. adim key ve value'lari map'den alip
        // iki farkli collection uyesine atadik

        Set<Integer> keySet=sinif.keySet();
        Collection<String> valueSet=sinif.values();

        System.out.println(keySet);
        System.out.println(valueSet);
        System.out.println(valueSet.size());

        //
        for (String each: valueSet) {
            System.out.println(each);
        }
    }
}
