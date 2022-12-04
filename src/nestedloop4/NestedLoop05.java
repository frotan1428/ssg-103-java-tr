package nestedloop4;

public class NestedLoop05 {

    public static void main(String[] args) {


            /*
            a
            a b
            a b c
            a b c d
            a b c d e
       şeklini yazdırınız.

       */


        char input ='f';  //97 =98-99-100-101
        for (char i = 'a'; i <= input; i++) {

            for (char j = 'a'; j <i ; j++) {
                System.out.print( j+ " ");

            }
            System.out.println("");

        }


        //
        //   MOHMMMAD FROTAN
            /*

            . . . . 1
            . . . 2 .
            . . 3 . .
            . 4 . . .
            5 . . . .

            // odev

         */


    }
}
