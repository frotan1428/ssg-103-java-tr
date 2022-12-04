package NestedLoop01;

public class NestedLoop04 {

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
        topStart();
        bottomStar();

        }
        public static void topStart(){
            for (int i = 1; i <=input ; i++) {

                for (int j = 1; j <=i ; j++) {

                    System.out.print("* ");
                }
                System.out.println("");
            }

        }

        public static void bottomStar(){
            for (int i = 1; i <=input-1 ; i++) {
                for (int j = 1; j <=input-i ; j++) {
                    System.out.print("* ");
                }
                System.out.println("");
            }
        }

    }

