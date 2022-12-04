package NestedLoop01;

public class NestedLoop08 {
    public static void main(String[] args) {

        /*
    soru -5 Asagidaki sekil cizen kodu yaziniz
         * * * *
         * * *
         * *
         *

         */

        //1 yol
        int input=5;

        for (int i = 1; i <=input-1 ; i++) {

            for (int j = 1; j <=input-i ; j++) {

                System.out.print("* ");
            }
            System.out.println("");
        }


        //2 yol
        int row = 4;
        for(int i=1; i<=row; i++){
            for(int k=row; k>=i; k--){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
