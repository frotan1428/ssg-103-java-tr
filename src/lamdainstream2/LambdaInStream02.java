package lamdainstream2;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class LambdaInStream02 {
    public static void main(String[] args) {

        System.out.println(toplamiBul(8,16));
        System.out.println(carpimi(7,15));
        YedininKatleri(21);


    }
    // S7:325 ile 468 arasinda 8 e bolunen sayilarin toplamini bulalim

    public static long toplamiBul(int x, int y){
        return IntStream.rangeClosed(x,y).filter(t-> t%8==0).sum();
    }
// S8: 7 ile 15 (dahil) arasindaki tek sayilarin carpimini bulalim

    public static OptionalInt carpimi (int a , int b){
        return IntStream.rangeClosed(a,b).filter(Utils::tekMi).reduce(Math::multiplyExact);

    }
    //S10: 21 den baslayan 7 nin katlarinin tek olanlari ilk 10 teriminin yaziralim

    public static void  YedininKatleri (int a){
      //  IntStream.iterate(21, t-> t+7).filter(Utils::tekMi).limit(20).forEach(Utils::TekSatirYazdir);
        IntStream.iterate(21, t-> t+7).filter(Utils::tekMi).limit(20).sum();

    }


}
