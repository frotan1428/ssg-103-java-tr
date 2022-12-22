package lambdainteger2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaInteger01 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));

        // S1:listi aralarinda bosluk birakarak yazdiriniz //
        for (Integer w :list){
            System.out.print(w + " ");
        }
        System.out.println();

        //list.forEach(t-> System.out.print(t +" ") );
        list.forEach(Utils::printInSameLine);
        negativeElemanleriYazdir(list);
        System.out.println(kareLeriYeniListeOlustur(list));

    }
    //S2: sadece negatif olanlari yazdir

    public static void negativeElemanleriYazdir(List<Integer> l){
        System.out.println();
        //l.stream().filter(t-> t>0).forEach(t-> System.out.print(t + " "));
        l.stream().filter(t-> t>0).forEach(Utils::printInSameLine);
    }

    // S4: list in elemanlarin karelerinden yeni bir list olusturalim

    public static List<Integer> kareLeriYeniListeOlustur(List<Integer> l){
        System.out.println();
        return l.stream().map(t->t*t).collect(Collectors.toList());
    }



}
