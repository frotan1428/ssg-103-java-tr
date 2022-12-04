package CollectionSet1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Hashset01 {
    public static void main(String[] args) {

        HashSet<String> hs1=new HashSet<>();
        hs1.add("K");
        hs1.add("K");
        hs1.add("B");
        hs1.add(null);
        hs1.add(null);
        System.out.println(hs1);//[null, B, K];
        System.out.println(hs1.size());//3

        //Interview Question :Type a code to display arraylist elements only one.
        // verilen bir ArrayListe  tekrarsiz  elemenleri yaziniz.


        List<Integer> list=new ArrayList<>();

        list.add(5);
        list.add(3);
        list.add(5);
        list.add(3);
        list.add(5);
        list.add(2);
        System.out.println(list);//[5, 3, 5, 3, 5, 2]

        HashSet<Integer> has3=new HashSet<>();
        has3.addAll(list);
        System.out.println(has3);//[2, 3, 5];

        //What was the difference between HashSet and SET ?





    }
}
