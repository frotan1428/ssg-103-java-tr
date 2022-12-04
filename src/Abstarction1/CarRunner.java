package Abstarction1;

public class CarRunner {

    public static void main(String[] args) {

        Toyota car1=new Toyota();
        System.out.println( car1.year + " "+car1.model + " "+car1.make);
        car1.make();
        car1.year();
        car1.model();

        System.out.println("=========");
        Honda car2=new Honda();
        System.out.println( car2.year + " "+car2.model + " "+car2.make);
        car2.make();
        car2.year();
        car2.model();

    }



}
