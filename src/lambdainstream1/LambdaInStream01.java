package lambdainstream1;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class LambdaInStream01 {

    public static void main(String[] args) {

    // S1:1 den 30 kadar olan sayilari (30 dahil degil) 1 2 3 .... seklinde siralayalim
        for (int i = 1; i < 31; i++) {
            System.out.print(i+" ");
        }
        ilk30(30);
        get20YuzeKaderYazdir(100);
        System.out.println(toplama(20,30));
        System.out.println(ort(30,40));
        System.out.println(sekizeBulanenSayi(325,468));
        sekizeBulanenSayiYazdir(325,468);

    }

    // S1:1 den 30 kadar olan sayilari (30 dahil degil) 1 2 3 .... seklinde siralayalim

    public static void ilk30(int a){
        System.out.println();
       // IntStream.rangeClosed(1,a).forEach(t-> System.out.print(t+" "));
        IntStream.rangeClosed(1,a).forEach(Utils::printInSmale);
    }

    //S2:  20 den 100 kadar olan sayilari (100 dahil ) 1 2 3 .... seklinde siralayalim (for loopsuz)

    public static void get20YuzeKaderYazdir(int a){
        System.out.println();
        IntStream.rangeClosed(20,a).forEach(Utils::printInSmale);
    }
    //S3 Istenen iki deger(dahil) arasindaki sayilari toplayalim  //20 ---30

    public static int toplama(int start,int end){
        System.out.println();
        return IntStream.rangeClosed(start,end).sum();
    }

    //S4: 30 ile 40 arasindaki sayilarin (dahil) ortalamasini bulalim

    public static OptionalDouble ort(int a, int b) {
      return  IntStream.rangeClosed(a, b).average();
    }
   //S5: 325 ile 468 arasinda 8 e bolunen kac sayi vardir?

    public static int sekizeBulanenSayi(int bas, int bitis){
        System.out.println();
        return (int) IntStream.rangeClosed(bas, bitis).filter(t -> t % 8 == 0).count();
    }

    public static void sekizeBulanenSayiYazdir(int bas, int bitis){
        System.out.println();
        IntStream.rangeClosed(bas, bitis).filter(t -> t % 8 == 0).forEach(Utils::printInDifSmale);
    }

}
