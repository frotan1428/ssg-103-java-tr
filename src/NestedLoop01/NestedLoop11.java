package NestedLoop01;

public class NestedLoop11 {

    public static final int SIZE = 5;
    public static void main(String[] args) {
    topHalf();
    }
    public static void topHalf() {
        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");
            for (int space = 1; space <= (line * -2 + (2*SIZE)); space++)
            {
                System.out.print(" "); }
            System.out.print("<>");
            for (int dot = 1; dot <= (line * 4 - 4); dot++) {
                System.out.print("."); }
            System.out.print("<>");
            for (int space = 1; space <= (line * -2 + (2*SIZE)); space++)
            {
            }
            System.out.print(" ");
            System.out.println("|"); }
    }

}

