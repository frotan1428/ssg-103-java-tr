package CollectionSet1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkHashSet01 {

    public static void main(String[] args) {
      //Interview: display all arrayList elements at once on the console?

        LinkedHashSet<Integer> lhs1=new LinkedHashSet<>();

        lhs1.add(12);
        lhs1.add(23);
        lhs1.add(10);
        lhs1.add(32);
        lhs1.add(5);
        lhs1.add(5);

        System.out.println(lhs1);//[12, 23, 10, 32, 5]

        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(5);
        list.add(3);
        System.out.println(list);//[5, 3, 5, 2, 5, 3]

        LinkedHashSet<Integer> lhs2=new LinkedHashSet<>(list);
        System.out.println(lhs2);//[5, 3, 2]






    }
}
