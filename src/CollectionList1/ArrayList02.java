package CollectionList1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList02 {

    public static void main(String[] args) {

        // bir listede ortalamanin ustunde olan element sayisini bulunuz

        List<Double> sayilar = new ArrayList<>();
        sayilar.add(1.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(3.0);
        sayilar.add(5.0);
        sayilar.add(6.0);
        sayilar.add(1.0);
        sayilar.add(7.0);


        double ortalama=0.0;
        double toplam=0.0;


        for (Double w:sayilar ) {
            toplam+=w;
        }
        double ort=toplam/sayilar.size();
        System.out.println("ort = " + ort);//ort = 3.875

        List<Double> ortalamaUsundekiler = new ArrayList<>();

        for (int i=0;i<sayilar.size(); i++){
            if (sayilar.get(i)>ort){
                ortalamaUsundekiler.add(sayilar.get(i));
            }
        }
        System.out.println(ortalamaUsundekiler);


    }
}
