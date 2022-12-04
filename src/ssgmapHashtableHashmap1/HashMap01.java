package ssgmapHashtableHashmap1;

import java.util.HashMap;
import java.util.Map;

public class HashMap01 {

    public static void main(String[] args) {

   //  Hashmap sadce key leri yazdrin.
        HashMap<String, String> baskentler = new HashMap<String, String>();

        baskentler.put("England", "London");
        baskentler.put("Germany", "Berlin");
        baskentler.put("Norway", "Oslo");
        baskentler.put("USA", "Washington DC");
        System.out.println(baskentler);
        System.out.println(baskentler.values()+  ""+ baskentler.keySet());


        // hashmaptaki elemenleri ekranda yaziniz.
        for (Map.Entry<String, String> b : baskentler.entrySet()){
            System.out.println("Key: " + b.getKey() + " Value: " + b.getValue());
        }

    }

}
