package lambdaString;

import lambdainteger.Utils;

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
        list.add("Oldu");

        System.out.println(dcIleBasYaz(list));
        yildizliYaz(list);
        System.out.println(alfabetikSira(list));
        lLeriSil(list);
        System.out.println(eOlanlarinlistesi(list));
    }



        /*
      public static void printElStuructured(List<Integer> sayi) {
          for (Integer w : sayi) {
              System.out.print(w + " ");
          }
      }

       */
    // S1: ilk harfi d ve ya c olanlari listeleyelim
    public static List<String> dcIleBasYaz(List<String> l){
        return l.stream().filter(t->t.startsWith("d") || t.startsWith("c") ).collect(Collectors.toList());
    }

    //S2: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim
    public static void yildizliYaz( List<String> l){
        l.stream().map(t-> "*" + t + "*").forEach(t-> System.out.println(t + " "));
        l.stream().map(t-> "*" + t + "*").forEach(Utils::printSameLine);
    }

    //S3: alfabetik  olarak siralayalim list olarak
    public static  List<String>  alfabetikSira( List<String> l){
        return l.stream().sorted().collect(Collectors.toList());
    }

    //S4: tum 'l' leri silelim yazdiralim
    public static void lLeriSil( List<String> l){
        System.out.println();
        l.stream().map(t->t.replaceAll("l", "")).
                forEach(t -> System.out.print(t + " "));

       // forEach(Utils::printSameLine);
    }

    //S5 : icinde e olanlardan yeni bir list olusturunuz

    public static  List<String>  eOlanlarinlistesi( List<String> l){
        System.out.println();
        return l.stream().filter(t -> t.contains("e")).collect(Collectors.toList());
    }

}


