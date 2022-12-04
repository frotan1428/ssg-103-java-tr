package Abstraction3;

public class Toyota extends Car{

    String make="Toyota";
    String model="Camry";
    int year =2022;

    @Override
    public void make() {
        System.out.println("Toyota make "+ make);
    }

    @Override
    public void model() {
        System.out.println("Toyota model "+ model);
    }

    @Override
    public void year() {
        System.out.println("Toyota year "+ year);
    }
}
