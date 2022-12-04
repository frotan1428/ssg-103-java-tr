package interface4;

public class SmartPhone implements GPS,Player,Radio{


    @Override
    public void getCoordinates() {
        System.out.println("get consolidate ");
    }

    @Override
    public void pause() {

        System.out.println("player start");

    }

    @Override
    public void stop() {
        System.out.println("player stop");
    }

    @Override
    public void next() {
        Player.super.next();
        Radio.super.next();
    }


    @Override
    public void startRadio() {
        System.out.println("radio start");

    }


    @Override
    public void stopRadio() {
        System.out.println("radio stop");
    }

}
