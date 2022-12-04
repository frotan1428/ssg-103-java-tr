package Abstarction1;

public class Toyota  extends Car{

    String make="Toyota";
    String model="Camry";
    int year =2022;

    @Override
    public void make() {
        System.out.println("arbanin make "+ make);
    }

    @Override
    public void model() {
        System.out.println("arbanin modeli "+ model);
    }

    @Override
    public void year() {
        System.out.println("arbanin yil "+ year);
    }
}
