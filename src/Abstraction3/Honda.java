package Abstraction3;

public class Honda extends Car{

    String make="Honda";
    String model="Accord";
    int year =2021;
    @Override
    public void make() {
        System.out.println("Honda make "+ make);
    }

    @Override
    public void model() {
        System.out.println("Honda model "+ model);
    }

    @Override
    public void year() {
        System.out.println("Honda year "+ year);
    }
}
