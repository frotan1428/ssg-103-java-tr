package Interface3;

public class SmartRunner {
    public static void main(String[] args) {

        SmartPhone phone=new SmartPhone();
        phone.getCoordinates();
        phone.start();
        phone.pause();
        phone.stop();
        phone.startRadio();
        phone.stopRadio();
        phone.next();
        System.out.println( Player.x);
        System.out.println( Radio.x);
        GPS.myMehtod();
        phone.musicStart();
        phone.musicStop();

    }
}
