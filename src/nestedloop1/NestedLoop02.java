package nestedloop1;

public class NestedLoop02 {

    public static void main(String[] args) {

           /*
        nested for loop ya diktorgen veya ucgen formatinda olabilir
        diktorgen istedigimizde iki loop icin de bagimsiz en point belirleriz
        ucgen sekli vermek icin inner loop'un end point'ini olarak outer degiskene bagli yapariz

         Soru 2 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin

         *
         * *               ******
                           ******
                           ******
         * * *
         * * * *
         * * * * *

         */

        // // outer loop bir deger aldiginde  inner loop bastan -sona  calsir sonra outer loop degeri degisir
        int input=2;

        for (int i = 1; i <=input ; i++) {



            for (int j = 1; j <=i ; j++) {



                System.out.print("* ");



            }

            System.out.println("");
        }



    }
}
