package lambdainteger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaInteger03 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));
        negatiflerinKareleri(list);
        besdenBuyukVarMi(list);
        sifirdanKucukMu(list);
        yuzeesit(list);
        sifiraesit(list);
        System.out.println(ilkBesTop(list));

    }


    // S11 : peek ornegi cozelim - negatiflerin karelerinden list olusturalim
    public static List<Integer> negatiflerinKareleri(List<Integer> l) {
        System.out.println();
        return l.stream().filter(t->t<0).
                peek(t-> System.out.println("negatifler :" +t)).
                map(t->t*t).
                peek(t-> System.out.println("kareleri :" + t)).
                collect(Collectors.toList());
        //denetlemek istedigimizin sonrasına ekliyoruz
    }

    // S12 : listeden 5 den buyuk  sayi var mi?
    public static boolean besdenBuyukVarMi(List<Integer> l) {
        return l.stream().anyMatch(t-> t>5); //true
    }


    // S13 : listenin tum elemanlari sifirdan kucuk mu?
    public static boolean sifirdanKucukMu(List<Integer> l) {
        return l.stream().allMatch(t-> t<0); //false
    }

    // S14: listenin 100 e esit elemani yok mu ?
    public static boolean yuzeesit(List<Integer> l) {
        return l.stream().noneMatch(t -> t == 100);  //true
    }


    // S15: listenin sifira esit elemani yok mu?
    public static boolean sifiraesit(List<Integer> l) {
        return l.stream().noneMatch(t -> t == 0); //false, 0 var
    }


    // S16:  listenin ilk 5 elemanini topla?
    public static int ilkBesTop(List<Integer> list) {
        return list.stream().limit(5).reduce(0, (x, y) -> x + y);
    }

}
