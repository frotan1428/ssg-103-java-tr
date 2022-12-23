package lambdastring4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaString02 {

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
        System.out.println(uzunlugu4Ve6HaricYazdir(list));
        ilkHarfBuyukDegerlerkucuk(list);

    }

    // S8: uzunlugu 4 ve 6 olanlar haric bir liste olusturunuz

    public static List<String> uzunlugu4Ve6HaricYazdir(List<String> l){
        return l.stream().filter(t-> t.length()==4  || t.length()==6).collect(Collectors.toList());

    }
    // S7: tum elemanlarin ilk harfini buyuk digerlerini kucuk yaziniz

    public static void ilkHarfBuyukDegerlerkucuk(List<String> l){
                         l.stream()
                        .map(t-> t.substring(0,1)
                        .toUpperCase() + t.substring(1).
                         toLowerCase()).forEach(Utils::printInSameLine);
    }
}
