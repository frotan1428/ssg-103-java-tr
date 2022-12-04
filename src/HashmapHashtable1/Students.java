package HashmapHashtable1;

import java.util.HashMap;
import java.util.Map;

public class Students {

    // Sinif listesini duzenli bir sekilde yazdirmak
    public static Map<Integer,String> myMap(){
        HashMap<Integer,String> sinifList = new HashMap<>();
        sinifList.put(101,"Ali, Can, Dev, 1453");
        sinifList.put(102,"Veli, Yan, QA, 1990");
        sinifList.put(103,"Ali, Yan, C#, 2000");
        sinifList.put(104,"Ayse, Kan, C#, 2001");
        sinifList.put(105,"Fatma, Han, Java, 2002");
        return sinifList;
    }


}
