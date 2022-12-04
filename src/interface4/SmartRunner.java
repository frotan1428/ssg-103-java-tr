package interface4;

public class SmartRunner {

    public static void main(String[] args) {

        SmartPhone tel=new SmartPhone();
        tel.getCoordinates();
        tel.pause();
        tel.startRadio();
        tel.stop();
        tel.stopRadio();

        System.out.println(Player.x);
        System.out.println(Radio.x);


    }

}
