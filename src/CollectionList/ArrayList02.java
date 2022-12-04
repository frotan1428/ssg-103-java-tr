package CollectionList;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class ArrayList02 {
    public static void main(String[] args) {

        // bir listede ortalamanin ustunde olan element sayisini bulunuz

        Queue<Double> sayilar = new LinkedList<>();
        sayilar.add(1.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(6.0);
        sayilar.add(1.0);
        sayilar.add(7.0);


        double ortalama=0.0;
        double  toplama=0.0;

        double toplam=0.0;for (Double w:sayilar ) {
            toplam+=w;
        }
        double ort=toplam/sayilar.size();
        System.out.println("ort = " + ort);//ort = 3.875


//        List<Double> ortalamainUstundkiler=new ArrayList<>();
//
//        for (int i = 0; i <sayilar.size() ; i++) {
//            if (sayilar.get(i)>ort){
//                ortalamainUstundkiler.add(sayilar.get(i));
//            }
//
//        }
//        System.out.println(ortalamainUstundkiler);
//
//
//        HashSet<Double>  hs1=new HashSet<>(ortalamainUstundkiler);
//      //  hs1.addAll(ortalamainUstundkiler);
//        System.out.println(hs1);


        System.out.println(sayilar);


    }
}
