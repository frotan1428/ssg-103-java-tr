package lambdainteger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaInteger02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));

        sirala(list);
        tersSirala(list);

        System.out.println(kuplerListe(list));

        System.out.println(karelerson5Degil(list));

        System.out.println(toplam(list));


    }

    //S6: listin elemanlarini kucukten buyuge siralayalim
    public static void sirala(List<Integer> l) {
        System.out.println();
        l.stream().sorted().forEach(t -> System.out.print(t + " "));
        l.stream().sorted().forEach(Utils::printSameLine);
    }

    //S7: listin elemanlarini buyukten kucuge siralayalim
    public static void tersSirala(List<Integer> l) {
        System.out.println();
        l.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.print(t + " "));
        //l.stream().sorted(Comparator.reverseOrder()).forEach(Utils::printSameLine);
    }

    // S8: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim
    public static List<Integer> kuplerListe(List<Integer> l) {
        System.out.println();
        return l.stream().filter(t->t>0).map(t->t*t*t).filter(t-> t%10==5).collect(Collectors.toList());
    }

    //S9: list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim
    public static List<Integer> karelerson5Degil(List<Integer> l) {
        System.out.println();
        return l.stream().filter(t->t>0).map(t->t*t).filter(t-> t%10!=5).collect(Collectors.toList());
    }

    // S10 :list elemanlarini toplamini bulalim
    public static int toplam(List<Integer> l){
        return l.stream().reduce(0,(x,y)-> x+y);
    }
}
