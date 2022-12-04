package NestedLoop2;

public class NestedLoop01 {
    public static void main(String[] args) {

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

        for (int line = 1; line <=10 ; line++) {





            // outer loop bir deger aldiginde  inner loop bastan -sona  calsir sonra outer loop degeri degisir



            for (int i = 1; i <= (-1 *line +10) ; i++) {





                System.out.print(". ");

            }
            System.out.println(line);

        }






    }
}
