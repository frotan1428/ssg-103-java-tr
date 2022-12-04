package CollectionSet1;

import java.util.HashSet;
import java.util.Set;

public class HashSet02 {
    public static void main(String[] args) {


        // verilen bir array'in tekrar eden elementlerini
        // sadece bir kere yazdiran bir method olusturun
        Integer arr[]= {3,5,4,6,3,1,2,7,8,6,1,4,2,8};

        arayiTekrarsizYazdir(arr);

    }

    public static  void arayiTekrarsizYazdir(Integer arr[]){

        HashSet<Integer> tekrarsizElementler =new HashSet<>();
            for (Integer each:arr){
                tekrarsizElementler.add(each);
            }

        System.out.println(tekrarsizElementler);//[1, 2, 3, 4, 5, 6, 7, 8]//


    }
}
