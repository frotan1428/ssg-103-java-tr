package lambdastring4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaString01 {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();

        list.add("Java");// *java*
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

        for (String w:list){
            System.out.print(w+ " ");
        }
        elemanlarYazdir(list);
        System.out.println( dcileBasliyorsaYazdir(list));
        basindaVeSonundaYildizYazdir(list);
        System.out.println(alfabetikSirala(list));
        LleriSildrenMehtod(list);
        System.out.println(eOlanlaraYazdir(list));


    }

    public static void  elemanlarYazdir(List<String> l){
        System.out.println();
       // l.forEach(t-> System.out.print(t +" "));
        l.forEach(Utils::printInSameLine);

    }
    // S1: ilk harfi d ve ya c olanlari listeleyelim

    public static List<String> dcileBasliyorsaYazdir(List<String> l){
        System.out.println();
         return l.stream().filter(t-> t.startsWith("d") || t.startsWith("c")).collect(Collectors.toList());
    }

    //S2: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim.

    public static void  basindaVeSonundaYildizYazdir(List<String> l){
        l.stream().map(t-> "*" + t +  "*").forEach(Utils::printInSameLine);
    }

    //S3: alfabetik  olarak siralayalim list olarak

    public static List<String> alfabetikSirala(List<String> l){
        System.out.println();
        return  l.stream().sorted().collect(Collectors.toList());
    }

    //S4: tum 'l' leri silelim yazdiralim

    public static void LleriSildrenMehtod(List<String> l){
        l.stream().map(t-> t.replaceAll("l","")).forEach(Utils::printInSameLine);
    }

    //S5 : icinde e olanlardan yeni bir list olusturunuz


    public static List<String> eOlanlaraYazdir(List<String> l){
        System.out.println();
        return  l.stream().filter(t-> !t.contains("e")).collect(Collectors.toList());
    }







}
