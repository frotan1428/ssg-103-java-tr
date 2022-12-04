package CollectionsList;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class LinkList02 {
    public static void main(String[] args) {

        // verilen bir listede tekrar eden sayilari sadece 1 kere yazdiran
        // bir method olusturun
        // orn : [1, 3, 5, 3, 5, 6, 1, 7]
        // output [1, 3, 5, 6, 7]

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        tekrarsizListeOlustur(sayilar); // [1, 3, 5, 6, 7]

        System.out.println(sayilar); // [1, 3, 5, 3, 5, 6, 1, 7]


        /* 2.way
        TreeSet<Integer>  tekrarsizList =new TreeSet<>(sayilar);

        System.out.println(tekrarsizList);

         */

    }




 // 1 way
    public static void tekrarsizListeOlustur(List<Integer> sayilar) {

        List<Integer> tekrarsizList = new ArrayList<>();

        for (Integer w:sayilar) {

            if (!tekrarsizList.contains(w)){
                tekrarsizList.add(w);
            }

        }

        System.out.println(tekrarsizList);
    }


}
