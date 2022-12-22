package lambdaString;

import lambdainteger.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaString03 {

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("Java");
        list.add("ogrenmek");
        list.add("cok");
        list.add("eglencelidi");
        list.add("lambda");
        list.add("gelince");
        list.add("Daha");
        list.add("da");
        list.add("Cok");
        list.add("Eglenceli");
        list.add("Oldu");

        ilkBuyuksonraKucuk(list);
        ilkHarfi3KereYaz(list);
        System.out.println(uzunluk4ve6Haric(list));
        uzunluk4ve6HaricYazdir(list);
    }
    // S6 : ilk harfini 3 kere tekrar edip yazalim ornek jjjava gibi
    public static void ilkHarfi3KereYaz( List<String> l){
        System.out.println();
        l.stream().map(t->t.substring(0,1).toUpperCase() + t.substring(0,1).toLowerCase() + t.toLowerCase()).
                forEach(t->System.out.println(t));
    }

    // S7: tum elemanlarin ilk harfini buyuk digerlerini kucuk yaziniz

    public static void ilkBuyuksonraKucuk( List<String> l){
        System.out.println();
        l.stream().map(t->t.substring(0,1).toUpperCase() + t.substring(1).toLowerCase()).
                forEach(t->System.out.println(t));
    }

    // S8: uzunlugu 4 ve 6 olanlar haric bir liste olusturunuz

    public static  List<String>  uzunluk4ve6Haric( List<String> l){
        System.out.println();
        return l.stream().filter(t -> t.length()!=4 && t.length()!=6).
                collect(Collectors.toList());
    }

    // S9: uzunlugu 4 ve 6 olanlar haric yazdirniz

    public static  void   uzunluk4ve6HaricYazdir( List<String> l){
        System.out.println();
        l.stream().filter(t -> t.length()!=4 && t.length()!=6).
                forEach(Utils::printSameLine);
    }

}
