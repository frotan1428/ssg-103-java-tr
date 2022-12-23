package lambdainteger3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaInteger02 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12,100,120,11,22));
        System.out.println(besDanBuyukVarMi(list));

        System.out.println(negativelerinKareLeri(list));;
        System.out.println();
        System.out.println(sifirdenKucuk(list));;

        // // S12 : listeden 5 den buyuk  sayi var mi?
        System.out.println(ilkBesTop(list));
    }

    public static boolean besDanBuyukVarMi(List<Integer> l){
        return l.stream().anyMatch(t-> t>5);
    }
    // S11 : peek ornegi cozelim - negatiflerin karelerinden list olusturalim

    public static List<Integer> negativelerinKareLeri(List<Integer> l){
        return l.stream().filter(t-> t<0).peek(t-> System.out.println("negtavileri "+ t)).map(t-> t*t).
                peek(t-> System.out.println("kareler "+ t)).collect(Collectors.toList());//[25, 64, 4, 144]
    }

    //// S13 : listenin tum elemanlari sifirdan kucuk mu?
    // S14: listenin 100 e esit elemani yok mu ?

    public static boolean sifirdenKucuk(List<Integer> l){
        return l.stream().noneMatch(t-> t==100);
    }

    // S16:  listenin ilk 5 elemanini topla?

    public static int ilkBesTop(List<Integer> list) {
        return list.stream().limit(5).reduce(0, (x, y) -> x + y);
    }

}
