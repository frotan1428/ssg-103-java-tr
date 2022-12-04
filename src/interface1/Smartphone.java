package interface1;

public class Smartphone implements Player,GPS{
    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void pause() {
        System.out.println("pause");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public void getCoordinates() {
        System.out.println("smartphone coordinate");
    }

    public static void main(String[] args) {

        Smartphone sm=new Smartphone();
        sm.getCoordinates();
        Player.method1();

    }
}
