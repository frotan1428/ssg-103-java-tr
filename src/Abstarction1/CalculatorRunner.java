package Abstarction1;

public class CalculatorRunner {

    public static void main(String[] args) {

        Profit profit=new Profit();
        System.out.println( profit.product(10,5));
        System.out.println(profit.divided(10,5));

        Loss loss=new Loss();
        System.out.println(loss.add(10,5));
        System.out.println(loss.subtract(10,5));
    }
}
