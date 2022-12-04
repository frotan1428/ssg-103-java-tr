package Abstraction2;

public class Toyota extends Car{
    String make="Toyota";
    String model="Camry";
    int year =2022;

    @Override
    public void make() {
        System.out.println("Toyotanin make "+make);
    }

    @Override
    public void model() {
        System.out.println("Toyotanin moddeli "+model);
    }
    @Override
    public void year() {
        System.out.println("toyotanin yili" +year);
    }
}
