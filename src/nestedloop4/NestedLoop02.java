package nestedloop4;

public class NestedLoop02 {

    public static void main(String[] args) {

        /*


        Soru 2 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin

         *
         * *
         * * *
         * * * *
         * * * * *

            // nested for loop ya diktorgen veya ucgen formatinda olabilir
           diktorgen istedigimizde iki loop icin de bagimsiz en point belirleriz
           ucgen sekli vermek icin inner loop'un end point'ini olarak outer degiskene bagli yapariz

       */

        // OUTER   INNER

        int input =6;

        for (int i = 1; i <=input ; i++) {

            for (int j = 1; j <=i; j++) {
                System.out.print("* ");

            }
            System.out.println("");

        }



        System.out.println("===============");

        for (int i = 1; i <=input ; i++) {

            for (int j = 1; j <=input; j++) {

                System.out.print("* ");

            }
            System.out.println("");

        }

       /*Soru 4) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin

        1
        22
        333
        4444
        55555

        */


        for (int i = 1; i <=5; i++) {


            for (int j = 1; j <=i; j++) {

                System.out.print(j+ " ");

            }
            System.out.println();

        }











    }
}
