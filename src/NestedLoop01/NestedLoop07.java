package NestedLoop01;

public class NestedLoop07 {

        public static void main(String[] args) {

         /*
            a
            a b
            a b c
            a b c d
            a b c d e
       şeklini yazdırınız.
       */

            char input ='f';

            for (char i = 'a'; i <=input ; i++) {
                for (char j = 'a'; j <=i ; j++) {
                    System.out.print(j + " ");
                }
                System.out.println("");
            }
        }
    }


