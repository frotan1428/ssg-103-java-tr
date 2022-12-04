package interface2;

public class Smartphone implements GPS,Radio,Player{

    @Override
    public void getCoordinates() {
        System.out.println("smartphone get coordinate");
    }

    @Override
    public void next() {
        GPS.super.next();
        Radio.super.next();
    }
    @Override
    public void startRadio() {
        System.out.println("smartphone stop radio");
    }

    @Override
    public void stopRadio() {
        System.out.println("smartphone stop radion");
    }

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

}
