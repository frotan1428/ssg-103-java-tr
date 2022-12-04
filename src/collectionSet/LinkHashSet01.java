package collectionSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkHashSet01 {
     /*
        LinkedHashSet'ler elemanlari ekleme sirasina(Insertion Order) gore yerlestirirler.
        LinkedHashSet elemanlari siralamada zaman harcadigi icin HashSet'lere gor eyavas calisir.
     */

    /*
        linked list accept duplicate , but linkedHast don't accept duplicate

        //Interview: display all arrayList elements at once on the console?
                I can use sets to get unique elements
                I can also loop through to give unique elements
                How much would you rate yourself out 10 in Java?
                I know Core Java
                String manipulations
                Data structures(Collections and Maps)
                OOP Concept
                Exceptions
       */

    public static void main(String[] args) {

        LinkedHashSet<Integer> lhs1=new LinkedHashSet<>();

        lhs1.add(12);
        lhs1.add(23);
        lhs1.add(10);
        lhs1.add(32);
        lhs1.add(5);
        lhs1.add(5);
        System.out.println(lhs1);//[12, 23, 10, 32, 5] no order

        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(5);
        list.add(3);
        System.out.println(list);//[5, 3, 5, 2, 5, 3]
        // interview Question :display all arrayList elemtns at once the console
        // butun ArrayList dakielmenlari sadce bir kare yazan code yaziniz

        LinkedHashSet<Integer> lhs2=new LinkedHashSet<>();

        lhs2.addAll(list);
        System.out.println(lhs2);//[5, 3, 2]

    }

}
