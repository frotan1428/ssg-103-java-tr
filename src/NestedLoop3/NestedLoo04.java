package NestedLoop3;

public class NestedLoo04 {

    public static void main(String[] args) {
/*

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



        /*


            . . . . 1
            . . . 2 .
            . . 3 . .
            . 4 . . .
            5 . . . .






         */



        for (int line = 1; line <= 5; line++) {
            for (int j = 1; j <= (-1 * line + 5); j++) {
                System.out.print("." + " ");
            }

             System.out.print(line+ " ");

            for (int j = 1; j <= (line-1); j++) {
                System.out.print("." + " ");
            }

            System.out.println();
        }


    }
}
