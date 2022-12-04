package CollectionList1;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LinkList01 {
    public static void main(String[] args) {
        // verilen bir listede tekrar eden sayilari sadece 1 tane yapan
        // bir method olusturun
        // orn : [1, 3, 5, 3, 5, 6, 1, 7]  bu listi
        //       [1, 3, 5, 6, 7] bu hale donusturun

        List<Integer> sayilar = new LinkedList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

      System.out.println(tekrarsizListeOlustur(sayilar));

    }

    public static List<Integer> tekrarsizListeOlustur(List<Integer> sayiLer){

        List<Integer> tekersizList=new LinkedList<>();
        for (int i=0;i<sayiLer.size(); i++){
            if (!tekersizList.contains(sayiLer.get(i))){
                tekersizList.add(sayiLer.get(i));
            }

        }
         return tekersizList;
    }


}
