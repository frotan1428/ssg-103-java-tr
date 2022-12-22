package lambdainsteam;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class LambdaInStream01 {
    public static void main(String[] args) {
        ilk30(30);
        System.out.println();
        ilk30Dahil(30);
        System.out.println();
        System.out.println("top(10,20) = " + top(10, 20));
        System.out.println("ort(20,30) = " + ort(20, 30));
        System.out.println();
        System.out.println("sekizeBolunen(325,468) = " + sekizeBolunen(325, 468));

    }

    /*
    public static void printElStuructured(List<Integer> sayi) {
        for (Integer w : sayi) {
            System.out.print(w + " ");
        }
    }

     */

    // S1:1 den 30 kadar olan sayilari (30 dahil degil) 1 2 3 .... seklinde siralayalim (for loopsuz)
    //range(int startInclusive, int endExclusive)
    public static void ilk30(int a) {
        IntStream.range(1, a).
                forEach(t -> System.out.print(t + " "));
    }

    //S2:  1 den 30 kadar olan sayilari (30 dahil ) 1 2 3 .... seklinde siralayalim (for loopsuz)
    //rangeClosed(int startInclusive, int endInclusive)
    public static void ilk30Dahil(int a) {
        IntStream.rangeClosed(1, a).
                forEach(t -> System.out.print(t + " "));
    }

    //S3 Istenen iki deger(dahil) arasindaki sayilari toplayalim
    public static int top(int bas, int bitis) {
        return IntStream.rangeClosed(bas, bitis).sum();
        // return IntStream.rangeClosed(bas,bitis+1).sum();
    }

    //S4: 30 ile 40 arasindaki sayilarin (dahil) ortalamasini bulalim
    public static OptionalDouble ort(int bas, int bitis) {
        return IntStream.rangeClosed(bas, bitis).average();
    }

    //S5: 325 ile 468 arasinda 8 e bolunen kac sayi vardir?
    public static long sekizeBolunen(int bas, int bitis) {
        return IntStream.rangeClosed(bas, bitis).
                filter(t -> t % 8 == 0).count();
    }
}
