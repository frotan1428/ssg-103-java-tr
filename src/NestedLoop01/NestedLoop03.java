package NestedLoop01;

public class NestedLoop03 {

    public static void main(String[] args) {


        /*


        * * * * .
        * * * . .
        * * . . .
        * . . . .
        . . . . .

         */
        startTop();

    }

    public static void startTop(){
        for (int line = 1; line <= 5; line++) {

            for (int j = 1; j <= (-1 * line + 5); j++) {
                System.out.print("*"+ " ");
            }

            for (int k = 1; k <= line; k++) {
                System.out.print("."+ " ");
            }

            System.out.println();
        }
    }
}
