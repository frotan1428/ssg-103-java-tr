package NestedLoop2;

public class NestedLoo04 {
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


    }


         */
        int input = 6;

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }

        for (int i = 1; i <= input - 1; i++) {

            for (int j = 1; j <= input - i; j++) {
                System.out.print("* ");

            }
            System.out.println("");

        }


    }
    }