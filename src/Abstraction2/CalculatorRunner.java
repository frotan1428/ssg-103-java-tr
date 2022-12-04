package Abstraction2;

public class CalculatorRunner {

    public static void main(String[] args) {

        Profit profit=new Profit();

        System.out.println(profit.add(10,5));
        System.out.println(profit.subtract(10,5));
        System.out.println(profit.product(10,6));


        System.out.println("===========");
        Loss loss=new Loss();


        System.out.println(loss.product(10,5));
        System.out.println(loss.divided(10,6));

    }
}
