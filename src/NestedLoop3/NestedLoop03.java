package NestedLoop3;

public class NestedLoop03 {

    public static void main(String[] args) {

        //  soru 7- kullanicidan bir rakam carpim tablosu olusturalim

        // 1 2 3         1*1  1*2  1*3
        // 2 4 6         2*1  2*2  2*3
        // 3 6 9         3*1  3*2  3*3
        // row -- satir    column sütunlar  |

//
//        int num = 8;
//        for(int i = 1; i < 11; ++i) {
//            System.out.println(i +"x"+ num + "="+ num * i);
//        }
//
//
//        int num1 = 9;
//        for(int i = 1; i < 11; ++i) {
//            System.out.println(i +"x"+ num1 + "="+ num1 * i);
//        }

        int input=10;

        for (int i = 1; i <=input; i++) {

            for (int j = 1; j <=input ; j++) {

                System.out.print((i*j)+" ");
            }
            System.out.println("");
        }


    }
}
