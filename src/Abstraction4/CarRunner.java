package Abstraction4;

public class CarRunner {
    public static void main(String[] args) {

        Toyota car1 =new Toyota();

        System.out.println(car1.make +" "+ car1.model+ " "+car1.year);

        car1.year();
        car1.model();
        car1.make();

    }
}
