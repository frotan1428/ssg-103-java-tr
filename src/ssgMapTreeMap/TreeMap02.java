package ssgMapTreeMap;

import java.util.*;

public class TreeMap02 {

    /*
           1)Maps have key - value structure
           2)Keys are unique but values are not
           3)Every element in a Map is called as "Entry"
           4)All elements are called as "EntrySet"
           5)Key cannot be null in maps except "HashMap" but value can

           6)HashMap's put the entries in random order, because of that
             it is super-fast
     */

    public static void main(String[] args) {

        //How to create a HashMap
        TreeMap<String, Integer> stdScore = new TreeMap<>();

        //How to put entries into a HashMap
        stdScore.put("Afra Cinar", 90);
        stdScore.put("Ali Tulubas", 95);
        stdScore.put("Betul Cavus", 100);
        stdScore.put("Can Aydin", 98);
        stdScore.put("M frotan", 90);

        System.out.println(stdScore);//{Can Aydin=98, Afra Cinar=90, Ali Tulubas=95, Betul Cavus=100, M frotan=90}

        //Map tan  sadece key  nasıl alınır
        Set<String> keys = stdScore.keySet();
        System.out.println(keys);//[Can Aydin, Afra Cinar, Ali Tulubas, Betul Cavus, M frotan]

        //Map tan  sadece   value   nasıl alınır
        Collection<Integer> ages = stdScore.values();
        System.out.println(ages);//[98, 90, 95, 100, 90]

        //Can I put null into key?
        //Yes you can use null "just" in HashMap Key
       // stdScore.put(null, 23);

        //Can I put null into value?
        stdScore.put("Esra Arslan", null);
        System.out.println(stdScore);//{null=23, Can Aydin=98, Afra Cinar=90, Esra Arslan=null, Ali Tulubas=95, Angelina Julie=23, Betul Cavus=100, M frotan=90}

        //What happens if you use same key repeatedly?
        //Java accepts the final value for the key(overwriting)
        stdScore.put("M frotan", 23);
        System.out.println(stdScore);

        //Bir key 'nin  değeri nasıl alınır?
        Integer tomAge = stdScore.get("Esra Arslan");
        System.out.println(tomAge);//23

        //If the key does not exist when you use get() method what happens?
        //It returns null for non-existing keys
        Integer unknownAge = stdScore.get("Tree Map bul");
        System.out.println(unknownAge);//null

        //getOrDefault("Abc Xyz", 0); method returns the value of "Abc Xyz" if Abc Xyz exists among the keys.
        //                                   returns the values of second parameter if Abc Xyz does not exist among the keys.
        Integer unknownAge2 = stdScore.getOrDefault("Tree Map bul", 0);
        System.out.println(unknownAge2);//0

        //I want to put an entry if it does not exist, if the entry exists I will not put it.

        stdScore.putIfAbsent("Can Aydin",98);
        System.out.println(stdScore);//{null=23, Can Aydin=98, Afra Cinar=90, Esra Arslan=null, Ali Tulubas=95, Betul Cavus=100, M frotan=23}

        stdScore.putIfAbsent("Emir", 95);//
        System.out.println(stdScore);//{null=23, Emir =95, Can Aydin=98, Afra Cinar=90, Esra Arslan=null, Ali Tulubas=95, Betul Cavus=100, M frotan=23}
        System.out.println("----");
        //Bir key  değeri nasıl güncellenir
        stdScore.replace("Emir", 100);
        System.out.println(stdScore);//{null=23, Emir =100, Can Aydin=98, Afra Cinar=90, Esra Arslan=null, Ali Tulubas=95, Betul Cavus=100, M frotan=23}

        //How to update the value of a key after checking key and the existing value

        //value  ve key  değeri kontrol ettikten sonra anahtarın değeri nasıl güncellenir
        stdScore.replace("M frotan", 23, 90);//
        System.out.println(stdScore);//{null=23, Emir=100, Can Aydin=98, Afra Cinar=90, Esra Arslan=null, Ali Tulubas=95, Betul Cavus=100, M frotan=90}

        //Map tan  bir entites nasıl kaldırılır
        System.out.println("----");
        stdScore.remove("M frotan");
        System.out.println(stdScore);//{null=23, Emir=100, Can Aydin=98, Afra Cinar=90, Esra Arslan=null, Ali Tulubas=95, Betul Cavus=100}


        ////Map tan  tek tek entries nasıl alınır
        Set<Map.Entry<String,Integer>> entries = stdScore.entrySet();

        for(Map.Entry<String,Integer> w : entries){
            System.out.print(w + "! ");
        }
    }
}
