package lambdastring1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaString01 {
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
        System.out.println(list);

        list.add("Oldu");
        //class name ::mehtodName

        //1. structured programing //
        for(String w:list){
            System.out.print(w + " ");
        }
        System.out.println();

        // functional  programming
        list.forEach(Utils::printSameLine);
        System.out.println(dcileBasYazdir(list));
        yildiLiYaz(list);
        System.out.println(alfabetik(list));
        lLeriSil(list);
        System.out.println(eOlanlarYazdir(list));
        System.out.println( uzunlug4Ve6Haric(list));;

    }

    // S1: ilk harfi d ve ya c olanlari listeleyelim
    public static List<String> dcileBasYazdir(List<String> l){
        System.out.println();
        return l.stream().filter(t-> t.startsWith("D") || t.startsWith("C")).collect(Collectors.toList());
        //
    }

    //S2: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim== *java*
    //

    public static void yildiLiYaz(List<String> l){
        //l.stream().map(t-> "*" + t+ "*").forEach(t-> System.out.println(t + " "));
        l.stream().map(t-> "*" + t+ "*").forEach(Utils::printSameLine);
    }

//      //S3: alfabetik  olarak siralayalim list olarak

    public static List<String> alfabetik(List<String> l){
        System.out.println();
       return l.stream().sorted().collect(Collectors.toList());
    }
    //S4: tum 'l' leri silelim yazdiralim

    public static void lLeriSil(List<String> l){
        System.out.println();
        l.stream().map(t-> t.replaceAll("l","")).forEach(Utils::printSameLine);
    }

    //S5 : icinde e olanlardan yeni bir list olusturunuz

    public static List<String> eOlanlarYazdir(List<String> l){
        System.out.println();
               return l.
                stream().
                filter(t->t.toLowerCase().contains("e")).
                collect(Collectors.toList());
    }

//    // S8: uzunlugu 4 ve 6 olanlar haric bir liste olusturunuz

    public static List<String> uzunlug4Ve6Haric(List<String> l){
        System.out.println();
        return l.
                stream().
                filter(t-> t.length()!=4 && t.length()!=6).
                collect(Collectors.toList());
    }

}
