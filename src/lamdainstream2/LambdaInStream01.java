package lamdainstream2;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class LambdaInStream01 {
    public static void main(String[] args) {

     // S1:1 den 30 kadar olan sayilari (30 dahil degil) 1 2 3 .... seklinde siralayalim

        for (int i = 1; i <=30 ; i++) {
            System.out.print(i+ " ");

        }
        ilk30(30);
        System.out.println("Toplmai : "+ toplami(20,21));

        System.out.println(ortalmaBul(30,40));

        //System.out.println(sekizeBulanaYazdir(325,468));
         sekizeBulanaYazdir(325,468);

    }

    public static void ilk30(int a){
        System.out.println();
       // IntStream.rangeClosed(1,a).forEach(t-> System.out.print(t + " "));
        IntStream.rangeClosed(1,a).forEach(Utils::TekSatirYazdir);
    }

    ////S3 Istenen iki deger(dahil) arasindaki sayilari toplayalim  /20 -30

    public static int toplami (int start,int end){
        System.out.println();
       return IntStream.rangeClosed(start,end).sum();
    }

    //S4: 30 ile 40 arasindaki sayilarin (dahil) ortalamasini bulalim

    public static OptionalDouble ortalmaBul (int start, int end){
        System.out.println();
        return IntStream.rangeClosed(start,end).average();
    }
    //S5: 325 ile 468 arasinda 8 e bolunen kac sayi vardir?

    public static void sekizeBulanaYazdir (int bas ,int bitis){
        //return IntStream.rangeClosed(bas,bitis).filter(t-> t %8==0).count();
       IntStream.rangeClosed(bas, bitis).filter(t->t%8==0).forEach(Utils::TekSatirYazdir);
    }





}
