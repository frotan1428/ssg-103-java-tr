package CollectionList;

import java.util.ArrayList;
import java.util.List;

public class ArraysList01 {

    public static void main(String[] args) {

        //verilen liste tum elemani ekranda yaziniz.
        List<Integer> liste= new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);

        System.out.println(liste);//[5, 7, 8, 6, 9]

        // for each kullanarak her elementi 2 artiralim

//        for (int w :liste){
//            System.out.print(w+2+" ");
//        }
        System.out.println();

        for (Integer each :liste){
            each=each+2;
            System.out.println(each);
        }
        System.out.println(liste);


    }
}
