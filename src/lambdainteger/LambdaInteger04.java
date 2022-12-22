package lambdainteger;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LambdaInteger04 {
    public static void main(String[] args) {
        List<Integer> intL= Arrays.asList(-2,-8,-5,1,2,5,6,7,15,6,8);

        tekYaz(intL);
        System.out.println();
        System.out.println("ciftleriCarp(intL) = " + ciftleriCarp(intL));
        System.out.println("kareToplami(intL) = " + kareToplami(intL));
        System.out.println("kupMax(intL) = " + kupMax(intL));

    }
    // S1: tekleri aralarinda bir bosluk birakarak yazdiralim
    public static void tekYaz(List<Integer>l){
        l.stream().filter(Utils::tekMi).forEach(Utils::printSameLine);
    }

    // S2: ciftlerin carpimini bulalim
    public static Optional<Integer> ciftleriCarp(List<Integer>l){
        return l.stream().filter(Utils::ciftMi).
                reduce(Math::multiplyExact);
        // multiplyExact Math classindan gelir, yan yana sayilari carpar
    }

    // S3: negatiflerin kare toplamlarini  bulalim
    public static Optional<Integer> kareToplami(List<Integer> l){
        return l.stream().filter(Utils::negatifMi).
                map(Utils::kareBul).reduce(Utils::toplam);
    }

    // S4: poziflerin kuplerinden max olani yazdiralim
    public static Optional<Integer> kupMax(List<Integer>l){
        return l.stream().filter(Utils::pozitifMi).
                map(Utils::kupBul).reduce(Math::max);
    }
}
