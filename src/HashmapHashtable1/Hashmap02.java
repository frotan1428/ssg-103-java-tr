package HashmapHashtable1;

import java.util.Collection;
import java.util.Map;

public class Hashmap02 {

    public static void main(String[] args) {

        Map<Integer,String> sinif=Students.myMap();
        System.out.println(sinif);
        System.out.println(sinif.keySet());
        System.out.println(sinif.entrySet());


        Collection<String> values=sinif.values();

        // sadce valuesler
        for (String w:values){
            System.out.println(w);
        }


        System.out.println("keys :values");
        for (Map.Entry<Integer,String> w: sinif.entrySet()){
            System.out.println(w.getKey()+ "  "+w.getValue());
        }


    }



}
