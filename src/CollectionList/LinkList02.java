package CollectionList;


import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkList02 {

    public static void main(String[] args) {

        List<Integer> liste= new LinkedList<>();


        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);

        
        for (Integer w: liste){
            System.out.print(w +" ");
        }

        System.out.println("");

        ListIterator itr= liste.listIterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+ " ");//5 7 8 6 9   -- 9  6 8 7 5
        }

        System.out.println();
        while (itr.hasPrevious()){
            System.out.print(itr.previous()+ " ");
        }


    }
}
