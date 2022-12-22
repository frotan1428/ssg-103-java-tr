package lambdastring3;

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
        System.out.println(list);
        //Structured programing .
        for (String w:list){
            System.out.println(w);
        }
        System.out.println("============");
        //functional  programing .
       // list.forEach(t-> System.out.print(t+" "));
        list.forEach(Utils::printInSameLine);

        System.out.println(dcileBaslayanlaraYazdir(list));
        basinaVeSonunaYildizYazdir(list);

        alfabetikGoreYazdir(list);
        lLeriSiliniz(list);

        // method reference ==> class name ::method

    }
    // S1: ilk harfi d ve ya c olanlari listeleyelim

    public static List<String> dcileBaslayanlaraYazdir(List<String> l){
        System.out.println();
        return l.stream().filter(t-> t.startsWith("d") || t.startsWith("c")).collect(Collectors.toList());
    }

    //S2: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim  --  *java*

    public static void basinaVeSonunaYildizYazdir(List<String> l){
        l.stream().map(t-> "*"+t+"*").forEach(Utils::printInSameLine);

    }

    //S3: alfabetik  olarak siralayalim list olarak
    public static void alfabetikGoreYazdir(List<String> l){
        System.out.println();
        l.stream().sorted().forEach(Utils::printInSameLine);

    }

    // //S4: tum 'l' leri silelim yazdiralim


    public static void lLeriSiliniz(List<String> l){
        System.out.println();
        l.stream().map(t-> t.replaceAll("l","")).forEach(Utils::printInSameLine);

    }


}
