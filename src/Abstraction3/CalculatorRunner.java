package Abstraction3;

public class CalculatorRunner {

    public static void main(String[] args) {

        Profit profit=new Profit();

        System.out.println(  profit.add(10,5));
        System.out.println(profit.subtract(10,5));
        System.out.println(profit.product(12,5));

        System.out.println("============");
        Loss loss =new Loss();
        System.out.println(loss.product(12,6));//72
        System.out.println(loss.divided(12,6));//2
    }
}
