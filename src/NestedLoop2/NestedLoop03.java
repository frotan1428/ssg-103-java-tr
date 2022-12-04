package NestedLoop2;

public class NestedLoop03 {

    public  static int input = 5;
    public static void main(String[] args) {

        // soru 6 Asagidaki sekil cizen kodu yaziniz
        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

         */
     ustYildiz();
     altYildiz();

    }

    public static void ustYildiz(){

        for (int i = 1; i <=5 ; i++) {

            for (int j = 1; j <=i; j++) {
                System.out.print("* ");

            }
            System.out.println("");

        }


    }

    public static void altYildiz(){
        for (int i = 1; i <=input-1 ; i++) {

            for (int j = 1; j <=input-i; j++) {
                System.out.print("* ");

            }
            System.out.println("");

        }

    }

}
