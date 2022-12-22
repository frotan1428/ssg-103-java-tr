package lambdainteger;

public class Utils {

    public static void printSameLine(Object o){
        System.out.print(o+" ");
    }

    public static boolean tekMi(int n){
        return n%2!=0;
    }

    public static boolean ciftMi(int n){
        return n%2==0;
    }

    public static boolean negatifMi(int n){
        return n<0;
    }

    public static boolean pozitifMi(int n){
        return n>0;
    }

    public static int kareBul(int n){
        return n*n;
    }

    public static int toplam (int a,int b){
        return a+b;
    }

    public static int kupBul(int n){
        return n*n*n;
    }

}
