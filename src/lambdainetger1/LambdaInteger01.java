package lambdainetger1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaInteger01 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));

        for (int w:list){
            System.out.print(w+" ");
        }
        hesiniYazdir(list);
        negtavileriYazdir(list);
        System.out.println(kareleriListle(list));

    }

    //// S1:listi aralarinda bosluk birakarak yazdiriniz //
    public static void hesiniYazdir(List<Integer> l){
        System.out.println();
       // l.forEach(w-> System.out.print(w+" "));
      //  l.stream().forEach(t-> System.out.print(t+ " "));
        l.stream().forEach(Utils::printSameLine);
    }
    //S2: sadece negatif olanlari yazdir

    public static void negtavileriYazdir(List<Integer> l){
        System.out.println();
        //l.stream().filter(t-> t<0).forEach(t-> System.out.print(t+ " "));
        l.stream().filter(t-> t>0).forEach(Utils::printSameLine);//1 12 5 6 9 15 8

    }

    // S4: list in elemanlarin karelerinden yeni bir list olusturalim /2*2

    public static List<Integer> kareleriListle(List<Integer> l){
        System.out.println();
        return l.stream().map(t-> t*t).collect(Collectors.toList());
    }





}
