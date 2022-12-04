package nestedloop4;

public class NestedLoop04 {

    public static void main(String[] args) {


         /*

        * * * * .
        * * * . .
        * * . . .
        * . . . .
        . . . . .

         */


        int input1 = 5;
        for (int line = 1; line <= input1 ; line++) {

            for (int j = 1; j <= (input1 - line); j++) {
                System.out.print("*" + " ");
            }

            for (int k = 1; k <= line; k++) {
                System.out.print("." + " ");
            }

            System.out.println();

        }

    }
}
