package lambdaString;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaString02 {

    public static void main(String[] args) {

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

}
