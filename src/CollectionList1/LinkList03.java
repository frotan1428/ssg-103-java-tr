package CollectionList1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LinkList03 {
    public static void main(String[] args) {

        List<Integer> liste= new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);

        ListIterator itr=liste.listIterator();

       while (itr.hasNext()){
           System.out.println(itr.next());
       }
        System.out.println("========");
       while (itr.hasPrevious()){
           System.out.println(itr.previous()+ " ");
       }

    }
}
