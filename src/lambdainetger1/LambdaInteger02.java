package lambdainetger1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaInteger02 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8,-2,-2, -12, 0, 1, 12, 5,6, 6, 9, 15, 8));
        sirala(list);
        System.out.println();
        naturalOrderReversed(list);
        System.out.println();
        System.out.println(newList(list));;
        System.out.println(sum(list));
    }
      //S6: listin elemanlarini kucukten buyuge siralayalim

    public static void sirala(List<Integer> l){
        l.stream().sorted().distinct().forEach(Utils::printSameLine);
    }


    //S7: listin elemanlarini buyukten kucuge siralayalim
    public static void naturalOrderReversed(List<Integer> list) {
        list.
                stream().
                sorted(Comparator.reverseOrder()).
                forEach(Utils::printSameLine);
    }
    // S8: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim

    public static List<Integer>newList(List<Integer> list) {
        return list.
                stream().filter(t-> t>0).map(t-> t*t*t).filter(t-> t%10==5).collect(Collectors.toList());

    }
    // S10 :list elemanlarini toplamini bulalim
    public static int sum(List<Integer>list){
        return list.
                stream().
                reduce(0,(a,b)-> a+b);
    }

}
