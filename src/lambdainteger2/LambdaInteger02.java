package lambdainteger2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaInteger02 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList( 5,5 , 6, 9, 15,15, 8));
        kucukTanBuyukYazdir(list);
        System.out.println(kubeleri5BasmagiYazdir(list));
        System.out.println();
        System.out.println("Toplmai : "+toplamYazdir(list));

    }

    //S6: listin elemanlarini kucukten buyuge siralayalim.

    public static void kucukTanBuyukYazdir(List<Integer> l){
        l.stream().sorted().distinct().forEach(Utils::printInSameLine);
        System.out.println();
        l.stream().sorted(Comparator.reverseOrder()).forEach(Utils::printInSameLine);
    }

    //// S8: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim

    public static List<Integer> kubeleri5BasmagiYazdir(List<Integer> l){

        System.out.println();
        return l.stream().distinct().filter(t-> t>0).map(t-> t*t*t).filter(t-> t%10==5).collect(Collectors.toList());
    }

    // S10 :list elemanlarini toplamini bulalim

    public static int toplamYazdir(List<Integer> l) {
        return l.stream().reduce(0,(x,y)-> x+y);
    }

}
