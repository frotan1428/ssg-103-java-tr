package lambdaString;

public class Utils {
    // lambda da method kullanimi :
    //ilk olarak class adi yazilir
    //sonra  :: noktalar konur
    //son olarak method secilir
    //String class i sayesinde length gibi touppercase gibi methodlari kullanabiliriz
    //Math classi sayesinde de sum vb methodlar kullanabiliriz

    public static void printSameLine(Object o){
        System.out.print(o+" ");
    }

    public static boolean EbasliyorMu(String S){
        return S.startsWith("E");
    }
}
