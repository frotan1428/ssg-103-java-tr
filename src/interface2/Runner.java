package interface2;

public class Runner {
    public static void main(String[] args) {

        Smartphone sm=new Smartphone();
        sm.getCoordinates();
        sm.pause();
        sm.start();
        sm.stop();
        sm.startRadio();
        sm.stopRadio();
        System.out.println(GPS.x);
        System.out.println(Player.x);
        sm.next();
    }
}
