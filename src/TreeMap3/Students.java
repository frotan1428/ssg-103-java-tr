package TreeMap3;

import java.util.Map;
import java.util.TreeMap;

public class Students {


//     // Sinif listesini duzenli bir sekilde yazdirmak

    public static Map<Integer,String> myMap(){
        // Sinif listesini duzenli bir sekilde yazdirmak
        TreeMap<Integer,String> sinifList = new TreeMap<>();
        sinifList.put(101,"Hacer , karadag ,QA, 1453");
        sinifList.put(102,"Emir, Yan, QA, 1990");
        sinifList.put(103,"Fahri  Ersoz, Yan, C#, 2000");
        sinifList.put(104,"Ibrahim ,Kan , Dev#, 2001");
        sinifList.put(105,"Eray ,Demir , Java, 2002");
        sinifList.put(105,"Matt ,frotan , fullStack , 2002");


        return sinifList;
    }


}
