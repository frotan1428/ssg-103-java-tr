package Abstarction1;

public class Honda extends Car{
    String make="Honda";
    String model="Accord";
    int year =2021;


    @Override
    public void make() {
        System.out.println("honda make"+make);
    }

    @Override
    public void model() {
        System.out.println("hondanin modeli "+model);
    }

    @Override
    public void year() {
        System.out.println("hondanin yili"+year);
    }
}
