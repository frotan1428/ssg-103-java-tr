package lambdastring3;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class LambdaString02 {

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

        System.out.println(eOlanElemenlariYazdir(list));
        ilkHarfi3KareYazdir(list);
        System.out.println("===========");
        ilkHarfiDegerliKucukYazdir(list);

    }

    //S5 : icinde e olanlardan yeni bir list olusturunuz

    public static List<String> eOlanElemenlariYazdir(List<String> l){
      return   l.stream().filter(t->!t.contains("e")).collect(Collectors.toList());
    }

    // S6 : ilk harfini 3 kere tekrar edip yazalim ornek jjjava gibi

    public static void ilkHarfi3KareYazdir(List<String> l){
        l.stream().map(t-> t.substring(0,1)+ t.substring(0,1)+t).forEach(t-> System.out.println(t));
    }

    //    // S7: tum elemanlarin ilk harfini buyuk digerlerini kucuk yaziniz

    public static void ilkHarfiDegerliKucukYazdir(List<String> l){
        System.out.println();
        l.stream().map(t-> t.substring(0,1).toUpperCase()+t.substring(1).toLowerCase()).forEach(t-> System.out.println(t));
    }

    // S8: uzunlugu 4 ve 6 olanlar haric bir liste olusturunuz

}
