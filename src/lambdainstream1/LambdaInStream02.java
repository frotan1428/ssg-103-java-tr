package lambdainstream1;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class LambdaInStream02 {

    public static void main(String[] args) {

        System.out.println(sekizeBulanenSayiToplmai(325,468));
        System.out.println(carpimi(7,11));
    }

    // S7:325 ile 468 arasinda 8 e bolunen sayilarin toplamini bulalim
    public static int sekizeBulanenSayiToplmai(int bas, int bitis){
        System.out.println();
       return IntStream.rangeClosed(bas, bitis).filter(t -> t % 8 == 0).sum();
    }

    // S8: 7 ile 15 (dahil) arasindaki tek sayilarin carpimini bulalim

    public static OptionalInt carpimi(int a , int b){
       // return  IntStream.rangeClosed(a,b).filter(Utils::tekMi).reduce(1,(x,y)-> x*y);
        return  IntStream.rangeClosed(a,b).filter(Utils::tekMi).reduce(Math::multiplyExact);
    }

    //S11: 21 den baslayan 7 nin katlarinin ilk 20 teriminin toplayalim

}
