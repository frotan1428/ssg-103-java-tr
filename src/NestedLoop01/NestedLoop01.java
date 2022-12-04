package NestedLoop01;

public class NestedLoop01 {

    public static void main(String[] args) {


        // row -- satir    column sütunlar  |

        /*
        nested for loop ya diktorgen veya ucgen formatinda olabilir
        diktorgen istedigimizde iki loop icin de bagimsiz en point belirleriz
        ucgen sekli vermek icin inner loop'un end point'ini olarak outer degiskene bagli yapariz
         */

         /*
        soru 1)  Asagidaki sekil cizen kodu yaziniz

        . . . .1
        . . . 2
        . . 3
        . 4
        5
          */




        for (int line  = 1;    line <= 5;    line++) {

            for (int j   = 1;   j <= (-1 * line + 5);      j++) {

                System.out.print("." +" ");

            }

            System.out.println(line);

        }

        // outer loop bir deger aldiginde  inner loop bastan -sona  calsir sonra outer loop degeri degisir

    }
}
