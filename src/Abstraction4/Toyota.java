package Abstraction4;

public class Toyota extends Car{

    String make="Toyota";
    String model="Camry";
    int year =2022;


    @Override
    public void make() {
        System.out.println("Toyota mmake  "+make);
    }

    @Override
    public void model() {
        System.out.println("Toyotanin modli  "+model);

    }

    @Override
    public void year() {

        System.out.println("Toyota nin yil "+year);
    }

}
