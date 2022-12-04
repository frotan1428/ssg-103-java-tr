package CollectionList;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkList01 {

    public static void main(String[] args) {

        // verilen bir listede tekrar eden sayilari sadece 1 kere yazdiran
        // bir method olusturun
        // orn : [1, 3, 5, 3, 5, 6, 1, 7]
        // output [1, 3, 5, 6, 7]

        List<Integer> sayilar = new LinkedList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);
        System.out.println(sayilar);

        tekrarsizListeOlustur(sayilar); // [1, 3, 5, 6, 7]

    }

    public static void tekrarsizListeOlustur(List<Integer> sayilar){

        List<Integer> tekrarsiz =new LinkedList<>();

        for (Integer w:sayilar){
            if (!tekrarsiz.contains(w)){
                tekrarsiz.add(w);
            }
        }
        System.out.println(tekrarsiz);

    }

}
