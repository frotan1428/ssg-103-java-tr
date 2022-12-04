package NestedLoop01;

public class NestedLoop02 {
    public static void main(String[] args) {


        // row -- satir    column sütunlar  |

        /*
       Soru 2 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin

         *
         * *
         * * *
         * * * *
         * * * * *

         */

        /*
        // nested for loop ya diktorgen veya ucgen formatinda olabilir
           diktorgen istedigimizde iki loop icin de bagimsiz en point belirleriz
           ucgen sekli vermek icin inner loop'un end point'ini olarak outer degiskene bagli yapariz
         */
        int input = 5;

   // part 1



        for (int i = 1;  i <=input ; i++) {


            for (int j = 1; j <=i ; j++) {

                System.out.print("* ");

            }
            System.out.println("");
        }


        // outer loop bir deger aldiginde  inner loop bastan -sona  calsir sonra outer loop degeri degisir

      // soru  3- Asagidaki sekil cizen kodu yaziniz

        /*
                . x
                . . x
                . . . x
                . . . . x
                . . . . . x

            */

        for (int i = 1; i <=input ; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.print(". ");
            }
            System.out.println("x");
        }





       /*Soru 4) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin

        1
        22
        333
        4444
        55555

        */

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i); }
            System.out.println(); }

    }



}
