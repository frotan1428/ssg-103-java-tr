package lambdainsteam;

import lambdainteger.Utils;

import java.util.stream.IntStream;

public class LambdaInStream02 {
    public static void main(String[] args) {

        sekizeBolunenSayiariYaz(325, 468);
        System.out.println();
        System.out.println("sekizeBolunenSayiariToplam(325,468) = " + sekizeBolunenSayiariToplam(325, 468));
        System.out.println("carpim(7,15) = " + carpim(7, 15));
        ilk10(10);
        System.out.println();
        yedininKatlari(21);
        System.out.println();
        System.out.println("yedininKatlaritoplam(20) = " + yedininKatlaritoplam(20));
    }

    //S6: 325 ile 468 arasinda 8 e bolunen sayilari yazdiralim
    public static void sekizeBolunenSayiariYaz(int bas, int bitis) {
        IntStream.rangeClosed(bas, bitis).
                filter(t -> t % 8 == 0).forEach(t -> System.out.print(t + " "));
    }

    // S7:325 ile 468 arasinda 8 e bolunen sayilarin toplamini bulalim
    public static int sekizeBolunenSayiariToplam(int bas, int bitis) {
        return IntStream.rangeClosed(bas, bitis).
                filter(t -> t % 8 == 0).sum();
    }

    // S8: 7 ile 15 (dahil) arasindaki tek sayilarin carpimini bulalim
    public static double carpim(int a, int b) {
        return IntStream.rangeClosed(a, b).filter(Utils::tekMi).reduce(1, (x, y) -> x * y);
    }

    //S9: pozitif tek sayilarin ilk 10 elemanin yazdiralim
    public static void ilk10(int a) {
        //  IntStream.rangeClosed(1,a).limit(10).
        //          filter(Methods::tekMi).forEach(Methods ::yazInteger);
        //  //1-10 arasındaki tek sayiları verir.. YANLIS
        IntStream.iterate(1, t -> t + 2).limit(10).
                forEach(Utils::printSameLine);

    }

    //S10: 21 den baslayan 7 nin katlarinin tek olanlari ilk 10 teriminin yaziralim

    public static void yedininKatlari(int a){
        IntStream.iterate(21,t->t+7).
                filter(Utils::tekMi).limit(10).
                forEach(Utils::printSameLine);
    }


    //S11: 21 den baslayan 7 nin katlarinin ilk 20 teriminin toplayalim

    public static int yedininKatlaritoplam(int a){
        return  IntStream.iterate(21,t->t+7).
                limit(20).
                sum();
    }
}
