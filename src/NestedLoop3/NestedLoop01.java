package NestedLoop3;

public class NestedLoop01 {
    public static void main(String[] args) {

        /*
        soru 1)  Asagidaki sekil cizen kodu yaziniz

                . . . .1
                . . . 2
                . . 3
                . 4
                5
               */


        for (int line = 1; line <=5 ; line++) {


            // outer loop bir deger aldiginde  inner loop bastan -sona  calsir sonra outer loop degeri degisir

            for (int i = 1; i <= (-1 *line +5) ; i++) {
                System.out.print("* ");
            }
            System.out.println(line);
        }

    }
}
