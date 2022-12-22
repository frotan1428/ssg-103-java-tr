package lambdainteger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaInteger01 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));

        hepsiniYaz(list);
        negatifleriYaz(list);
        System.out.println(pozitifList(list));
        System.out.println(kareleriList(list));
        System.out.println(kareleriTekrarsizList(list));

    }

      /*
    public static void printElStuructured(List<Integer> sayi) {
        for (Integer w : sayi) {
            System.out.print(w + " ");
        }
    }

     */

    // S1:listi aralarinda bosluk birakarak yazdiriniz //
    public static void hepsiniYaz(List<Integer> l) {
       // l.stream().forEach(t -> System.out.print(t + " "));
        l.stream().forEach(Utils::printSameLine);
    }

    //S2: sadece negatif olanlari yazdir
    public static void negatifleriYaz(List<Integer> l) {
        System.out.println();
       // l.stream().filter(t -> t < 0).forEach(t -> System.out.print(t + " "));
        l.stream().filter(t -> t < 0).forEach(Utils::printSameLine);
    }

    //S3: pozitif olanlardan yeni bir liste olustur
    public static List<Integer> pozitifList(List<Integer> l) {
        System.out.println();
        return l.stream().filter(t -> t > 0).collect(Collectors.toList());
    }


    // S4: list in elemanlarin karelerinden yeni bir list olusturalim

    public static List<Integer> kareleriList(List<Integer> l) {
        System.out.println();
        return l.stream().map(t -> t * t).collect(Collectors.toList());
    }


    //S5 : list in elemanlarin karelerinden tekrarsiz yeni bir list olusturalim
    public static List<Integer> kareleriTekrarsizList(List<Integer> l) {
        System.out.println();
        return l.stream().distinct().map(t -> t * t).collect(Collectors.toList());
    }



}
