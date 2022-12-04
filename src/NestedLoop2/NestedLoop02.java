package NestedLoop2;

public class NestedLoop02 {
    public static void main(String[] args) {

     /*
        nested for loop ya diktorgen veya ucgen formatinda olabilir
        diktorgen istedigimizde iki loop icin de bagimsiz en point belirleriz
        ucgen sekli vermek icin inner loop'un end point'ini olarak outer degiskene bagli yapariz
        */

/*
        Soru 2 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin

        *
         * *
         * * *
         * * * *
         * * * * *

         */
// arkadasiniz codu
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println("* ");
//        }
//
        int input =10;
        for (int i = 0; i < input; i++) {

            for (int j = 0; j <input ; j++) {
                System.out.print("$ ");
            }
            System.out.println("");

        }

    }
}
