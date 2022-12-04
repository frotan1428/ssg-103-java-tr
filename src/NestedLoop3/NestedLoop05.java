package NestedLoop3;

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


        char input='H';


        for (char i = 'A'; i <input; i++) {

            for (char j = 'A'; j <=i ; j++) {

                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
