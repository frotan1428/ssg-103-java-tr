package lambdainteger3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LambdaInteger01 {

    public static void main(String[] args) {

        List<Integer> intL= Arrays.asList(-2,-8,-5,1,2,5,6,7,15,6,8);
        tekYaz(intL);
        MethodRefrenceIleYazdir(intL);
        System.out.println( ciflerinCarpmi(intL));
        System.out.println();
        System.out.println( kareToplami(intL));
        System.out.println();
        System.out.println(KupMax(intL));
//        for (Integer w:intL){
//            System.out.print(w + " ");
//        }

    }


    // S1: tekleri aralarinda bir bosluk birakarak yazdiralim

    public static void tekYaz(List<Integer> l){
        l.stream().filter(t-> t%2!=0).forEach(t-> System.out.print(t + " "));
    }

    public static void MethodRefrenceIleYazdir(List<Integer> l){
        System.out.println();
        l.stream().filter(Utils::tekMi).forEach(Utils::printSameLine);
    }

    // S2: ciftlerin carpimini bulalim
    public static Optional<Integer> ciflerinCarpmi(List<Integer> l){
        return  l.stream().filter(Utils::ciftMi).reduce(Math::multiplyExact);

       // return l.stream().filter(Utils::ciftMi).reduce(1,(x,y)->x*y);
    }

    // S3: negatiflerin kare toplamlarini  bulalim
    public static Optional<Integer> kareToplami (List<Integer> l){
        return  l.stream().filter(Utils::negatifMi).map(Utils::kareBul).reduce(Utils::toplam);

    }

    // S4: poziflerin kuplerinden max olani yazdiralim

    public static Optional<Integer> KupMax (List<Integer> l){
       return l.stream().filter(Utils::pozitifMi).map(Utils::kupBul).reduce(Math::max);
    }


}
