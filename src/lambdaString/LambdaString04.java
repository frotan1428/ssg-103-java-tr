package lambdaString;

import lambdainteger.Utils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaString04 {

    public static void main(String[] args) {
        List<String> l = Arrays.asList("Elma", "Muz", "Portakal", "Cilek", "Limon");
        buyukYaz(l);
        System.out.println();
        sirala(l);
        eIleBas(l);

    }

    // S1: Tum harfleri buyuk harf ile aralarinda bosluk birakarak yazdiralim
    public static void buyukYaz(List<String> l) {
        l.stream().map(t -> t.split("")).
                flatMap(Arrays::stream).
                map(String::toUpperCase).forEach(Utils::printSameLine);
    }

    //S2: Stringleri uzunluklarina gore siralayip yaziniz
    public static void sirala(List<String>l){
        l.stream().
                sorted(Comparator.comparing(String :: length)).
                forEach(System.out ::println);
    }

    //S3: E ILE Baslayanlari yazdiralim
    public static void eIleBas(List<String>l){
        l.stream().filter(lambdaString.Utils::EbasliyorMu).
                forEach(Utils::printSameLine);
    }

}
