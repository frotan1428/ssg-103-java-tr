package CollectionList1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Arraylist01 {

    public static void main(String[] args) {
        //verilen liste tum elemani ekranda yaziniz.
        List<Integer> liste= new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        System.out.println(liste); // [5, 7, 8, 6, 9]
        // for each kullanarak her elementi 2 artiralim

        for (Integer each :liste){
            each=each+2;
            System.out.println(each);
        }


        for (Integer w: liste) {
            liste.set(liste.indexOf(w), w + 2);

        }
        System.out.println(liste);


        for (Integer w:liste) {
            System.out.println((w+2) +" ");
        }


    }
}
